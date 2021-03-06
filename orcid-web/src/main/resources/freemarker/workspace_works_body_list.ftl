<#--

    =============================================================================

    ORCID (R) Open Source
    http://orcid.org

    Copyright (c) 2012-2013 ORCID, Inc.
    Licensed under an MIT-Style License (MIT)
    http://orcid.org/open-source-license

    This copyright and license information (including a link to the full license)
    shall be included in its entirety in all copies or substantial portion of
    the software.

    =============================================================================

-->
<#if (currentWorks)??>

	<ul class="workspace-publications workspace-body-list">
        <#list currentWorks as work>
        <#-- @ftlvariable name="work" type="org.orcid.frontend.web.forms.CurrentWork" -->
            <li>
             <span class="pull-right"><@orcid.privacyLabel work.visibility /></span>
                <h3 class="work-title"><b>${(work.title)!}</b><#if (work.subtitle)??>: <span class="work-subtitle">${(work.subtitle)!""}</span></#if><#if (work.year)??> <#if (work.month)??><@orcid.month work.month />-</#if>${work.year}</#if></h3>
                <#if (work.currentWorkExternalIds)??>
                    <#list work.currentWorkExternalIds as ei>
                    <#-- @ftlvariable name="ei" type="org.orcid.frontend.web.forms.CurrentWorkExternalId" -->
                        <#if (ei.type = 'doi') && (ei.id)??>
                            <span class="work-metadata">DOI: <a href="http://dx.doi.org/${ei.id}">${ei.id}</a></span>
                            <img onclick="javascript:window.open(&quot;http://dx.doi.org/${ei.id}&quot;)" style="cursor:pointer;" src="<@spring.url '/static/img/view_full_text.gif'/>"><input type="hidden" value="null" name="artifacts[0].destApp"><input type="hidden" value="JOUR" name="artifacts[0].type"><input type="hidden" value="W" name="artifacts[0].uploadedBy">
                        </#if>
                    </#list>
                </#if>
                <#if (work.url)??>
                    <div><a href="${work.url}">${work.url}</a></div>
                </#if>
                <#if (work.description)?? && work.description?has_content>
                    <div>${work.description}</div>
                <#else>
                    <#if (work.citationForDisplay)??><div class="citation ${work.citationType}">${work.citationForDisplay}</div></#if>
                </#if>
            </li>           
        </#list>
	</ul>
	
	<#--<#if profile.orcidActivities.orcidWorks.orcidWork?size &gt; 10>
		<p><a href="<@spring.url '/publications/manage'/>" class="btn btn-primary">View more <span class="icon-arrow-right"></span></a></p>
	</#if>-->

<#else>
    <div class="alert alert-info">
        <strong><#if (publicProfile)?? && publicProfile == true>No publications added yet<#else>You haven't added any works, <a href="<@spring.url '/works-update'/>" class="update">add some now</a></#if></strong>
    </div>
</#if>