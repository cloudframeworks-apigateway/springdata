<#include "base.ftl">
<@page>
    <ul>
        <#list personList as person>
            <li>${person.pid}---${person.name}---${person.age}</li>
        </#list>
    </ul>
</@page>


