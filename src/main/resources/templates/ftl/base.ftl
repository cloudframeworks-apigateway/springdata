<#macro page
    title="API GateWay"
    assets=[]
    static={}
    useheader="default"
    usefooter="default"
    currentChannel="NONE"
    bodyclass="none"
    menu="0"
    description=""
    keywords=""
    flash=[]
    crossdomains=[]
    footerassets=[]
    nofollow="1"
    viewport="0"
    metaExtend=[]
    linkExtend=[]>
<!DOCTYPE html>
<html class="${uaOS!''} ${uaBrowser!''}">
<head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8"/>
    <#if !(assets?? && assets?size gt 0 && assets?seq_contains('/css/site/no-ie7.css'))>
        <meta http-equiv="x-ua-compatible" content="ie=7"/>
    </#if>
    <title>
        ${title?html}
    </title>
    <link rel="shortcut icon" href="${AssetsUrl("/images/favicon.ico")}" />
    <meta content="${description}" name="description"/>
    <meta content="${keywords}" name="keywords"/>
    <#if viewport == "1">
        <meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1">
    </#if>
    <#if nofollow=="1">
        <meta name="robots" content="nofollow" />
    </#if>
    <#if metaExtend?? &&metaExtend?size gt 0>
        <#list metaExtend as metaItem>
            <#if metaItem?is_hash>
                <meta <#list metaItem?keys as key><#if metaItem[key]??>${key}="${metaItem[key]}"</#if> </#list>/>
            </#if>
        </#list>
    </#if>
    <#if linkExtend?? &&linkExtend?size gt 0>
        <#list linkExtend as linkItem>
            <#if linkItem?is_hash>
                <link <#list linkItem?keys as key><#if linkItem[key]??>${key}="${linkItem[key]}"</#if> </#list>/>
            </#if>
        </#list>
    </#if>
    <!--引入变量-->
    <link rel="stylesheet" type="text/css" href="/static/node_modules/bootstrap/dist/css/bootstrap.css"/>
    <script type="text/javascript" src="/static/node_modules/jquery/dist/jquery.js"></script>
    <script type="text/javascript" src="/static/node_modules/jquery/dist/jquery.slim.js"></script>
    <script type="text/javascript" src="/static/node_modules/bootstrap/dist/js/bootstrap.js"></script>
    <script type="text/javascript" src="/static/node_modules/jquery.cookie/jquery.cookie.js"></script>
    <@AssetsImport assets />
</head>

<body <#if bodyclass != "none">class="${bodyclass}"</#if>>

    <script type="text/javascript">
        var _body_start = new Date();
    </script>

    <#--<#if crossdomains?size != 0>-->
        <#--<#list crossdomains as domain>-->
            <#--<iframe src="http://${configs['domains.'+domain]}/crossdomain/proxy.html<#if currentDate??>?t=${currentDate.getTime()}</#if>" id="${domain}-ajax-frame" style="display:none;"></iframe>-->
        <#--</#list>-->
        <#--<script type="text/javascript">-->
            <#--document.domain = '${configs['domains.root']}';-->
        <#--</script>-->
    <#--</#if>-->

    <#if useheader != "none">
        <#include "header.ftl"/>
        <#--<@header vary="${useheader}"
            menu="${menu}"
            currentChannel="${realChannel}"/>-->
    </#if>

    <!-- main content -->
    <div id="content-wrap">
        <#nested/>
    </div>

    <#if usefooter != "none">
        <#include "footer.ftl"/>
    </#if>

    <#--<#if flash?seq_contains("upload") || flash?seq_contains("swfupload")>-->
        <#--<@jselement file='/lib/flash/swfupload.js' />-->
    <#--</#if>-->
    <#--<#if flash?size != 0>-->
        <#--<@jselement file='/js/jquery.swfajax.js' />-->
    <#--</#if>-->

    <script type="text/javascript">
        var root_canShowRegFloat = true;
        $(function(){
            var is_login = $.cookie('dj_auth') != null || $.cookie('dj_auth_v3') != null;
        });
    </script>

    <#if !(user?? || loginUser??) >
    <script type="text/javascript">
        $(function(){
            console.log('user login!');
        });
    </script>
    </#if>

    <#list footerassets as file>
        <#if file?ends_with('.js')>
            <@jselement file='${file}' />
        </#if>
    </#list>
</body>
</html>
</#macro>

<#function AssetsUrl file="">
    <#--用macro宏会导致空格的出现，所以换成function-->
    <#assign assetsDomain = "127.0.0.1:8080"/>
    <#if file?index_of("/") == 0>
        <#return "http://${assetsDomain}${file}"/>
    <#else>
        <#return "http://${assetsDomain}/${file}"/>
    </#if>
</#function>

<#--<#function WrapperAssetsWithVersion file>-->
    <#--<#if (!file?ends_with(".css") && !file?ends_with(".js"))>-->
        <#--<#return file/>-->
    <#--</#if>-->
    <#--<#if file?ends_with(".css")>-->
        <#--<#return file?substring(0,file?last_index_of(".css")) + "." + assetsDataMap[file] + ".css"/>-->
    <#--<#else>-->
        <#--<#return file?substring(0,file?last_index_of(".js")) + "." + assetsDataMap[file] + ".js"/>-->
    <#--</#if>-->
<#--</#function>-->

<#macro AssetsImport assets=[]>
    <#list assets as assetsfile>
        <#if assetsfile?ends_with(".js")>
            <@jselement file='${assetsfile}' />
        <#else>
            <@csselement file='${assetsfile}' />
        </#if>
    </#list>
</#macro>

<#macro jselement file="">
    <#if file?length gt 0>
        <script type="text/javascript" src="${AssetsUrl("${file}")}"></script>
    </#if>
</#macro>

<#macro csselement file="">
    <#if file?length gt 0>
        <link rel="stylesheet" type="text/css" href="${AssetsUrl("${file}")}"/>
    </#if>
</#macro>



