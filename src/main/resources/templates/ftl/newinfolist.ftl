<#include "base.ftl">
<@page >
    <ul>
        <#list newInfoList as newInfo>
            <li>${newInfo.nid}---${newInfo.title}---${newInfo.content}</li>
        </#list>
    </ul>
</@page>

