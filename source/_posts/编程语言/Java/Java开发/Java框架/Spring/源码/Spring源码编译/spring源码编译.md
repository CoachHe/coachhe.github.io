```html

<!DOCTYPE html><meta http-equiv="Content-Type" content="text/html; charset=UTF-8"><base href="https://www.cxyzjd.com/article/qq_38762237/107815524"><style>body{margin-left:0;margin-right:0;margin-top:0}#bN015htcoyT__google-cache-hdr{background:#f8f9fa;font:13px arial,sans-serif;text-align:left;color:#202124;border:0;margin:0;border-bottom:1px solid #dadce0;line-height:16px;padding:16px 28px 24px 28px}#bN015htcoyT__google-cache-hdr *{display:inline;font:inherit;text-align:inherit;color:inherit;line-height:inherit;background:none;border:0;margin:0;padding:0;letter-spacing:0}#bN015htcoyT__google-cache-hdr a{text-decoration:none;color:#1a0dab}#bN015htcoyT__google-cache-hdr a:hover{text-decoration:underline}#bN015htcoyT__google-cache-hdr a:visited{color:#4b11a8}#bN015htcoyT__google-cache-hdr div{display:block;margin-top:4px}#bN015htcoyT__google-cache-hdr b{font-weight:bold;display:inline-block;direction:ltr}</style><div id="bN015htcoyT__google-cache-hdr"><div><span>这是 Google 对 <a href="https://www.cxyzjd.com/article/qq_38762237/107815524">https://www.cxyzjd.com/article/qq_38762237/107815524</a> 的缓存。</span>&nbsp;<span>这是该网页在 2021年11月5日 07:28:53 GMT 的快照。</span>&nbsp;<span><a href="https://www.cxyzjd.com/article/qq_38762237/107815524">当前页</a>在此期间可能已经更改。</span>&nbsp;<a href="http://support.google.com/websearch/bin/answer.py?hl=zh-CN&amp;p=cached&amp;answer=1687222"><span>了解详情</span>.</a></div><div><span style="display:inline-block;margin-top:8px;margin-right:104px;white-space:nowrap"><span style="margin-right:28px"><span style="font-weight:bold">完整版本</span></span><span style="margin-right:28px"><a href="http://webcache.googleusercontent.com/search?q=cache:_iHifSFoEWsJ:https://www.cxyzjd.com/article/qq_38762237/107815524&amp;newwindow=1&amp;hl=zh-CN&amp;strip=1&amp;vwsrc=0"><span>纯文字版本</span></a></span><span style="margin-right:28px"><a href="http://webcache.googleusercontent.com/search?q=cache:_iHifSFoEWsJ:https://www.cxyzjd.com/article/qq_38762237/107815524&amp;newwindow=1&amp;hl=zh-CN&amp;strip=0&amp;vwsrc=1"><span>查看源代码</span></a></span></span></div><span style="display:inline-block;margin-top:8px;color:#70757a"><span>提示：要在此页面上快速找到您的搜索字词，请按 <b>Ctrl+F</b> 或者 <b>⌘-F</b>（Mac），然后使用查找栏搜索。</span></span></div><div style="position:relative;"><!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
<meta name="keywords" content="【Spring源码分析】1、IDEA导入spring-framework-5.2.8.RELEASE源码构建本地阅读环境_Tellsea-程序员宅基地" />
<meta name="description" content="文章目录1、构建初始化工作2、构建spring源码到本地10、Spring-Framework 各个模块的作用1、构建初始化工作相关软件版本必须一致，否则会产生各种不必要的错误等JDK 1.8Gradle-5.6.4（可以查看gradle/wrapper/gradle-wrapper.properties文件中配置的版本，官方提供的是radle-5.6.4）IntelliJ IDEA 2019.1 x64 以上2、构建spring源码到本地最新源码地址最新稳定版源码地址（推荐）将源" />
<!--[if IE]>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <![endif]-->
<title>【Spring源码分析】1、IDEA导入spring-framework-5.2.8.RELEASE源码构建本地阅读环境_Tellsea-程序员宅基地 - 程序员宅基地</title>
<script async src="https://pagead2.googlesyndication.com/pagead/js/adsbygoogle.js?client=ca-pub-9066218177779829" crossorigin="anonymous"></script>

<script type="text/javascript" async="true">
(function() {
    var host = 'www.themoneytizer.com';
    var element = document.createElement('script');
    var firstScript = document.getElementsByTagName('script')[0];
    var url = 'https://quantcast.mgr.consensu.org'
        .concat('/choice/', '6Fv0cGNfc_bw8', '/', host, '/choice.js');
    var uspTries = 0;
    var uspTriesLimit = 3;
    element.async = true;
    element.type = 'text/javascript';
    element.src = url;

    firstScript.parentNode.insertBefore(element, firstScript);

    function makeStub() {
        var TCF_LOCATOR_NAME = '__tcfapiLocator';
        var queue = [];
        var win = window;
        var cmpFrame;

        function addFrame() {
            var doc = win.document;
            var otherCMP = !!(win.frames[TCF_LOCATOR_NAME]);

            if (!otherCMP) {
                if (doc.body) {
                    var iframe = doc.createElement('iframe');

                    iframe.style.cssText = 'display:none';
                    iframe.name = TCF_LOCATOR_NAME;
                    doc.body.appendChild(iframe);
                } else {
                    setTimeout(addFrame, 5);
                }
            }
            return !otherCMP;
        }

        function tcfAPIHandler() {
            var gdprApplies;
            var args = arguments;

            if (!args.length) {
                return queue;
            } else if (args[0] === 'setGdprApplies') {
                if (
                    args.length > 3 &&
                    args[2] === 2 &&
                    typeof args[3] === 'boolean'
                ) {
                    gdprApplies = args[3];
                    if (typeof args[2] === 'function') {
                        args[2]('set', true);
                    }
                }
            } else if (args[0] === 'ping') {
                var retr = {
                    gdprApplies: gdprApplies,
                    cmpLoaded: false,
                    cmpStatus: 'stub'
                };

                if (typeof args[2] === 'function') {
                    args[2](retr);
                }
            } else {
                queue.push(args);
            }
        }

        function postMessageEventHandler(event) {
            var msgIsString = typeof event.data === 'string';
            var json = {};

            try {
                if (msgIsString) {
                    json = JSON.parse(event.data);
                } else {
                    json = event.data;
                }
            } catch (ignore) {}

            var payload = json.__tcfapiCall;

            if (payload) {
                window.__tcfapi(
                    payload.command,
                    payload.version,
                    function(retValue, success) {
                        var returnMsg = {
                            __tcfapiReturn: {
                                returnValue: retValue,
                                success: success,
                                callId: payload.callId
                            }
                        };
                        if (msgIsString) {
                            returnMsg = JSON.stringify(returnMsg);
                        }
                        event.source.postMessage(returnMsg, '*');
                    },
                    payload.parameter
                );
            }
        }

        while (win) {
            try {
                if (win.frames[TCF_LOCATOR_NAME]) {
                    cmpFrame = win;
                    break;
                }
            } catch (ignore) {}

            if (win === window.top) {
                break;
            }
            win = win.parent;
        }
        if (!cmpFrame) {
            addFrame();
            win.__tcfapi = tcfAPIHandler;
            win.addEventListener('message', postMessageEventHandler, false);
        }
    };

    if (typeof module !== 'undefined') {
        module.exports = makeStub;
    } else {
        makeStub();
    }

    var uspStubFunction = function() {
        var arg = arguments;
        if (typeof window.__uspapi !== uspStubFunction) {
            setTimeout(function() {
                if (typeof window.__uspapi !== 'undefined') {
                    window.__uspapi.apply(window.__uspapi, arg);
                }
            }, 500);
        }
    };

    var checkIfUspIsReady = function() {
        uspTries++;
        if (window.__uspapi === uspStubFunction && uspTries < uspTriesLimit) {
            console.warn('USP is not accessible');
        } else {
            clearInterval(uspInterval);
        }
    };

    if (typeof window.__uspapi === 'undefined') {
        window.__uspapi = uspStubFunction;
        var uspInterval = setInterval(checkIfUspIsReady, 6000);
    }
})();
</script>

</head>
<body>

<header>
<script>
var _hmt = _hmt || [];
(function() {
  var hm = document.createElement("script");
  hm.src = "https://hm.baidu.com/hm.js?6cbb0b5c46d9c0d9f023dd022abfc71e";
  var s = document.getElementsByTagName("script")[0]; 
  s.parentNode.insertBefore(hm, s);
})();
</script>

<script async src="https://www.googletagmanager.com/gtag/js?id=G-JCH1CNWGFS"></script>
<script>
  window.dataLayer = window.dataLayer || [];
  function gtag(){dataLayer.push(arguments);}
  gtag('js', new Date());

  gtag('config', 'G-JCH1CNWGFS');
</script>
<link href="/css/bootstrap.css" rel="stylesheet" />
<link href="/css/style.css" rel="stylesheet" />
<link href='/css/css.css' rel='stylesheet' type='text/css' />
<script type="text/javascript" src="/js/jquery.min.js"></script>
<div id="header">
<div class="container">
<div class="row">
<div class="col-md-4 logo-div">
<div class="logo-inner">
<div class="logo-name">
<a href="/">
<span>程序员宅基地</span>
<small>程序员宅基地，技术文章由你所想念有所思</small>
</a>
</div>
<br />
<div class="links-home">
<a href="/">首页 /</a>
<a href="#">联系我们 /</a>
<a href="/copyright" rel="nofollow,noindex" target="_blank">版权申明
/</a>
<a href="/privacy-policy" rel="nofollow,noindex" target="_blank">隐私条款</a>
</div>
</div>
</div>
</div>
</div>
</div>
<div style="width: 100%;text-align: center"><a href="https://promotion.aliyun.com/ntms/yunparter/invite.html?source=5176.11533457&amp;userCode=qy9bwd3g" target="_blank"><img src="https://www.cxyzjd.com/images/guanggao.jpg" style="width: 80% !important;height: 120px;"></a>
</div>

<div class="info-sec">
<div class="container">
<div class="row">
<div class="col-md-2" style="width:100%;">
<div class="social-link" style="float:right;">
 <form id="searchForm" action="/searchArticle" method="post">
<div>
<input type="text" name="qc" style="width:200px;" /> <input type="submit" value="搜索" style="color:black;" />
</div>
</form>
</div>
</div>
<div style="clear:both;"></div>
</div>
</div>
</div>
</header>

<div class="container">
<div class="row">

<div style="text-align:center;" id="82741-31"><script src="//ads.themoneytizer.com/s/gen.js?type=31"></script><script src="//ads.themoneytizer.com/s/requestform.js?siteId=82741&formatId=31"></script></div>
<div style="clear:both;"></div>
<div class="col-md-8">
<h2 style="line-height: 32px;">
<span>【Spring源码分析】1、IDEA导入spring-framework-5.2.8.RELEASE源码构建本地阅读环境_Tellsea-程序员宅基地</span>
</h2>
<p style="margin-bottom:5px;">技术标签：&nbsp;<span><a href="/searchArticle?qc=Spring源码分析&amp;page=1" title="Spring源码分析">Spring源码分析</a>&nbsp;&nbsp;</span>
</p>
<div style="clear:both;"></div>
<div style="padding:5px 5px 5px 5px;word-wrap: break-word; word-break: normal;max-width: 850px;" id="article_content">
<span><div id="content_views" class="markdown_views prism-atom-one-dark">
<svg xmlns="http://www.w3.org/2000/svg" style="display: none;">
<path stroke-linecap="round" d="M5,0 0,2.5 5,5z" id="raphael-marker-block" style="-webkit-tap-highlight-color: rgba(0, 0, 0, 0);"></path>
</svg>
<p></p>
<div class="toc">
<h3>文章目录</h3>
<ul>
<li><a href="#1_1">1、构建初始化工作</a></li>
<li><a href="#2spring_8">2、构建spring源码到本地</a></li>
<li>
<ul>
<li>
<ul>
<li><a href="#1_9">（1）拉取项目源码</a></li>
<li><a href="#2gradle_15">（2）使用本地gradle</a></li>
<li><a href="#3gradlebat_19">（3）执行gradle.bat</a></li>
<li><a href="#3idea_22">（3）idea导入项目</a></li>
<li><a href="#4springoxm_27">（4）预编译spring-oxm</a></li>
<li><a href="#5doscgradle_30">（5）修改dosc.gradle</a></li>
<li><a href="#6AspectJ_33">（6）添加AspectJ编译</a></li>
<li><a href="#7springcorejar_54">（7）修改spring-core缺失jar</a></li>
<li><a href="#8SingletonTargetSource_63">（8）解决SingletonTargetSource找不到</a></li>
<li><a href="#9spring_73">（9）构建spring源码</a></li>
</ul> </li>
</ul> </li>
<li><a href="#3_87">3、创建测试模块</a></li>
<li><a href="#4_99">4、报错问题汇总</a></li>
<li>
<ul>
<li>
<ul>
<li><a href="#1CoroutinesUtils_100">（1）报错：找不到CoroutinesUtils</a></li>
<li><a href="#2springcglibrepack330jarspringobjenesisrepack31jar_104">（2）报错：缺少spring-cglib-repack-3.3.0.jar，spring-objenesis-repack-3.1.jar</a></li>
<li><a href="#3Error354_51_java____CoroutinesUtils_113">（3）报错：Error:(354, 51) java: 找不到符号 符号: 变量 CoroutinesUtils</a></li>
<li><a href="#4Aspectj_Error38_38_java_orgspringframeworkaoptarget_121">（4）报错：Aspectj Error:(38, 38) java: 程序包org.springframework.aop.target不存在</a></li>
<li><a href="#5_import_orgspringframeworkaoptargetSingletonTargetSource_142">（5）报错：找不到 import org.springframework.aop.target.SingletonTargetSource;</a></li>
</ul> </li>
</ul> </li>
<li><a href="#5_153">5、其他相关项目整理</a></li>
<li>
<ul>
<li>
<ul>
<li><a href="#1_154">（1）强迫症修改项目名与配置名相同</a></li>
<li><a href="#2github_162">（2）上传项目到github/码云</a></li>
</ul> </li>
</ul> </li>
<li><a href="#_179">微信公众号</a></li>
</ul>
</div>
<p></p>
<h1><a id="1_1"></a>1、构建初始化工作</h1>
<p>相关软件版本必须一致，否则会产生各种不必要的错误等</p>
<ul>
<li>JDK 1.8</li>
<li>Gradle-5.6.4（可以查看gradle/wrapper/gradle-wrapper.properties文件中配置的版本，官方提供的是radle-5.6.4）</li>
<li>IntelliJ IDEA 2019.1 x64 以上（其他版本没试过）</li>
</ul>
<h1><a id="2spring_8"></a>2、构建spring源码到本地</h1>
<h3><a id="1_9"></a>（1）拉取项目源码</h3>
<ul>
<li><a href="https://github.com/spring-projects/spring-framework">最新源码地址</a></li>
<li><a href="https://github.com/spring-projects/spring-framework/tree/v5.2.8.RELEASE">最新稳定版源码地址5.2.8.RELEASE（推荐）</a></li>
</ul>
<p>将源码拉取或下载到本地<br> <img src="https://img-blog.csdnimg.cn/2020081010181911.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM4NzYyMjM3,size_16,color_FFFFFF,t_70" alt="在这里插入图片描述"></p>
<h3><a id="2gradle_15"></a>（2）使用本地gradle</h3>
<p>目的是为了不需要再次下载gradle，我这里把<code>gradle-5.6.4-bin.zip</code>的安装包放在了gradle的安装目录下<br> <img src="https://img-blog.csdnimg.cn/20200810102124294.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM4NzYyMjM3,size_16,color_FFFFFF,t_70" alt="在这里插入图片描述"><br> <img src="https://img-blog.csdnimg.cn/2020081010201581.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM4NzYyMjM3,size_16,color_FFFFFF,t_70" alt="在这里插入图片描述"></p>
<h3><a id="3gradlebat_19"></a>（3）执行gradle.bat</h3>
<p>项目根目录输入cmd，执行gradle.bat命令<br> <img src="https://img-blog.csdnimg.cn/20200810100411163.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM4NzYyMjM3,size_16,color_FFFFFF,t_70" alt="在这里插入图片描述"></p>
<h3><a id="3idea_22"></a>（3）idea导入项目</h3>
<p>导入项目，使用本地gradle<br> <img src="https://img-blog.csdnimg.cn/20200810114342587.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM4NzYyMjM3,size_16,color_FFFFFF,t_70" alt="在这里插入图片描述"><br> 导入之后，刷新gradle，应该要很长时间，一定要网很好的地方刷新，不然总是报错，多刷新几次<br> <img src="https://img-blog.csdnimg.cn/20200810100605751.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM4NzYyMjM3,size_16,color_FFFFFF,t_70" alt="在这里插入图片描述"></p>
<h3><a id="4springoxm_27"></a>（4）预编译spring-oxm</h3>
<p>这一步是官方给出的导入步骤，使用<code>./gradlew :spring-oxm:compileTestJava</code>预编译spring-oxm<br> <img src="https://img-blog.csdnimg.cn/20200810100538569.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM4NzYyMjM3,size_16,color_FFFFFF,t_70" alt=""></p>
<h3><a id="5doscgradle_30"></a>（5）修改dosc.gradle</h3>
<p>在编译之前还需要对<code>spring-framework-5.2.8.RELEASE/gradle/dosc.gradle</code>文档进行修改，因为有些注释，文件路径在编译时需要调整<br> <img src="https://img-blog.csdnimg.cn/20200810100824500.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM4NzYyMjM3,size_16,color_FFFFFF,t_70" alt="在这里插入图片描述"></p>
<h3><a id="6AspectJ_33"></a>（6）添加AspectJ编译</h3>
<p>问题原因是spring源码的AOP使用了aspectJ ，而java不识别aspectJ<br> 用迅雷下载（因为快）AspectJ：<a href="https://www.eclipse.org/aspectj/downloads.php">https://www.eclipse.org/aspectj/downloads.php</a><br> <img src="https://img-blog.csdnimg.cn/20200810104442940.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM4NzYyMjM3,size_16,color_FFFFFF,t_70" alt="在这里插入图片描述"><br> <img src="https://img-blog.csdnimg.cn/20200810110815268.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM4NzYyMjM3,size_16,color_FFFFFF,t_70" alt="在这里插入图片描述"></p>
<p><code>java -jar aspectj-1.9.6.jar</code> 运行下载的jar进行安装<br> <img src="https://img-blog.csdnimg.cn/20200810104807466.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM4NzYyMjM3,size_16,color_FFFFFF,t_70" alt="在这里插入图片描述"><br> <img src="https://img-blog.csdnimg.cn/20200810104827727.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM4NzYyMjM3,size_16,color_FFFFFF,t_70" alt="在这里插入图片描述"><br> <img src="https://img-blog.csdnimg.cn/2020081010484764.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM4NzYyMjM3,size_16,color_FFFFFF,t_70" alt="在这里插入图片描述"><br> ctrl + alt + shift + s<br> <img src="https://img-blog.csdnimg.cn/20200810103707851.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM4NzYyMjM3,size_16,color_FFFFFF,t_70" alt="在这里插入图片描述"><br> 添加两个</p>
<ul>
<li>AspectJ(spring.spring-aop.main)</li>
<li>AspectJ(spring.spring-aspects.main)<br> <img src="https://img-blog.csdnimg.cn/20200810103850305.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM4NzYyMjM3,size_16,color_FFFFFF,t_70" alt="在这里插入图片描述"><br> 添加之后的效果<br> <img src="https://img-blog.csdnimg.cn/20200810114728359.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM4NzYyMjM3,size_16,color_FFFFFF,t_70" alt="在这里插入图片描述"></li>
</ul>
<p>修改AspectJ编译的方式<br> <img src="https://img-blog.csdnimg.cn/20200810104959814.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM4NzYyMjM3,size_16,color_FFFFFF,t_70" alt="在这里插入图片描述"></p>
<h3><a id="7springcorejar_54"></a>（7）修改spring-core缺失jar</h3>
<p>spring-core缺少spring-cglib-repack-3.3.0.jar，spring-objenesis-repack-3.1.jar<br> <img src="https://img-blog.csdnimg.cn/20200809110738854.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM4NzYyMjM3,size_16,color_FFFFFF,t_70" alt="在这里插入图片描述"><br> 找到 Gradle&gt;spring-core&gt;Tasks&gt;other下面的两个工具，双击运行<img src="https://img-blog.csdnimg.cn/2020080913230020.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM4NzYyMjM3,size_16,color_FFFFFF,t_70" alt="在这里插入图片描述"><br> <img src="https://img-blog.csdnimg.cn/2020080912244160.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM4NzYyMjM3,size_16,color_FFFFFF,t_70" alt="在这里插入图片描述"><br> <img src="https://img-blog.csdnimg.cn/20200809132505711.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM4NzYyMjM3,size_16,color_FFFFFF,t_70" alt="在这里插入图片描述"><br> 把原来报错的两个jar删除，保留新导入的本地jar即可，效果图如下<br> <img src="https://img-blog.csdnimg.cn/20200810134650340.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM4NzYyMjM3,size_16,color_FFFFFF,t_70" alt="在这里插入图片描述"></p>
<h3><a id="8SingletonTargetSource_63"></a>（8）解决SingletonTargetSource找不到</h3>
<p>首先，打开类<code>spring-aop\src\main\java\org\springframework\aop\framework\AopProxyUtils.java</code>发现报错，<br> 报错找不到<code>import org.springframework.aop.target.SingletonTargetSource;</code>，网上没人解决这个问题，我是和同时讨论之间找到解决方法的。</p>
<p>在Windows下查看该目录<code>spring-aop\src\main\java\org\springframework\aop\target</code>是存在的，但是在idea中显示不出来</p>
<p>解决方法：File–&gt;Settings–&gt;Editor–&gt;File Types–&gt;右边Ignore files and folders找到target文件名去掉即可<br> <img src="https://img-blog.csdnimg.cn/20200810134007552.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM4NzYyMjM3,size_16,color_FFFFFF,t_70" alt="在这里插入图片描述"><br> 这时，target目录出来了，但是变成了灰色，修改项目根目录下的<code>.gitignore</code>注释掉<code>target/</code>，文件则可正常使用<br> <img src="https://img-blog.csdnimg.cn/20200810134153608.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM4NzYyMjM3,size_16,color_FFFFFF,t_70" alt="在这里插入图片描述"></p>
<h3><a id="9spring_73"></a>（9）构建spring源码</h3>
<p>看侧边栏就知道，这个过程比较漫长，我时间短是因为clean之后构建过好几次<br> <img src="https://img-blog.csdnimg.cn/20200810110541162.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM4NzYyMjM3,size_16,color_FFFFFF,t_70" alt="在这里插入图片描述"><br> 如果报错<br> <img src="https://img-blog.csdnimg.cn/2020081011061386.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM4NzYyMjM3,size_16,color_FFFFFF,t_70" alt="在这里插入图片描述"><br> 随便找一个maven项目，把下面的坐标放进去，刷新maven，让本地仓库有这个jar包即可</p>
<pre><code class="prism language-xml"><span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>dependency</span><span class="token punctuation">&gt;</span></span>
    <span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>groupId</span><span class="token punctuation">&gt;</span></span>org.aspectj<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>groupId</span><span class="token punctuation">&gt;</span></span>
    <span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>artifactId</span><span class="token punctuation">&gt;</span></span>aspectjtools<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>artifactId</span><span class="token punctuation">&gt;</span></span>
    <span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>version</span><span class="token punctuation">&gt;</span></span>1.9.5<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>version</span><span class="token punctuation">&gt;</span></span>
<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>dependency</span><span class="token punctuation">&gt;</span></span>
</code></pre>
<h1><a id="3_87"></a>3、创建测试模块</h1>
<p><img src="https://img-blog.csdnimg.cn/20200809110842499.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM4NzYyMjM3,size_16,color_FFFFFF,t_70" alt="项目名邮件"><br> <img src="https://img-blog.csdnimg.cn/2020080911085673.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM4NzYyMjM3,size_16,color_FFFFFF,t_70" alt="在这里插入图片描述"><br> <img src="https://img-blog.csdnimg.cn/20200809110914956.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM4NzYyMjM3,size_16,color_FFFFFF,t_70" alt="在这里插入图片描述"><br> <img src="https://img-blog.csdnimg.cn/20200809110932206.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM4NzYyMjM3,size_16,color_FFFFFF,t_70" alt="在这里插入图片描述"><br> 添加spring核心依赖，<code>compile(project(":spring-context"))</code><br> <img src="https://img-blog.csdnimg.cn/20200809111030288.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM4NzYyMjM3,size_16,color_FFFFFF,t_70" alt="在这里插入图片描述"><br> <img src="https://img-blog.csdnimg.cn/20200810135812669.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM4NzYyMjM3,size_16,color_FFFFFF,t_70" alt="在这里插入图片描述"><br> <img src="https://img-blog.csdnimg.cn/20200809111141692.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM4NzYyMjM3,size_16,color_FFFFFF,t_70" alt="在这里插入图片描述"><br> <img src="https://img-blog.csdnimg.cn/20200810135906677.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM4NzYyMjM3,size_16,color_FFFFFF,t_70" alt="在这里插入图片描述"><br> 如有报错，则根据以下报错汇总解决即可</p>
<h1><a id="4_99"></a>4、报错问题汇总</h1>
<h3><a id="1CoroutinesUtils_100"></a>（1）报错：找不到CoroutinesUtils</h3>
<p><img src="https://img-blog.csdnimg.cn/2020081011291695.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM4NzYyMjM3,size_16,color_FFFFFF,t_70" alt="在这里插入图片描述"><br> 找到<code>spring-core\kotlin-coroutines\build\libs\kotlin-coroutines-5.2.8.RELEASE.jar</code>，右键 Add As Library，然后点开IDEA上方工具栏，Build - Rebuild Project，没有效果则关闭项目重新打开再点击Rebuild Project，简单粗暴<br> <img src="https://img-blog.csdnimg.cn/20200810112745870.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM4NzYyMjM3,size_16,color_FFFFFF,t_70" alt="在这里插入图片描述"></p>
<h3><a id="2springcglibrepack330jarspringobjenesisrepack31jar_104"></a>（2）报错：缺少spring-cglib-repack-3.3.0.jar，spring-objenesis-repack-3.1.jar</h3>
<p>spring-core缺少spring-cglib-repack-3.3.0.jar，spring-objenesis-repack-3.1.jar<br> <img src="https://img-blog.csdnimg.cn/20200809110738854.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM4NzYyMjM3,size_16,color_FFFFFF,t_70" alt="在这里插入图片描述"><br> 找到 Gradle&gt;spring-core&gt;Tasks&gt;other下面的两个工具，双击运行<img src="https://img-blog.csdnimg.cn/2020080913230020.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM4NzYyMjM3,size_16,color_FFFFFF,t_70" alt="在这里插入图片描述"><br> <img src="https://img-blog.csdnimg.cn/2020080912244160.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM4NzYyMjM3,size_16,color_FFFFFF,t_70" alt="在这里插入图片描述"><br> <img src="https://img-blog.csdnimg.cn/20200809132505711.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM4NzYyMjM3,size_16,color_FFFFFF,t_70" alt="在这里插入图片描述"><br> 把原来报错的两个jar删除，保留新导入的本地jar即可，效果图如下<br> <img src="https://img-blog.csdnimg.cn/20200810134650340.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM4NzYyMjM3,size_16,color_FFFFFF,t_70" alt="在这里插入图片描述"></p>
<h3><a id="3Error354_51_java____CoroutinesUtils_113"></a>（3）报错：Error:(354, 51) java: 找不到符号 符号: 变量 CoroutinesUtils</h3>
<p><img src="https://img-blog.csdnimg.cn/20200809133428612.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM4NzYyMjM3,size_16,color_FFFFFF,t_70" alt="在这里插入图片描述"><br> 找到<code>spring-core\kotlin-coroutines\build\libs\kotlin-coroutines-5.2.8.RELEASE.jar</code>，右键 Add As Library，然后点开IDEA上方工具栏，Build - Rebuild Project，没有效果则关闭项目重新打开再点击Rebuild Project，简单粗暴<br> <img src="https://img-blog.csdnimg.cn/20200810112745870.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM4NzYyMjM3,size_16,color_FFFFFF,t_70" alt="在这里插入图片描述"><br> 或者执行以下操作，实际上是一样的效果， 就是将jar添加到模块中<br> <img src="https://img-blog.csdnimg.cn/2020080913365183.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM4NzYyMjM3,size_16,color_FFFFFF,t_70" alt="在这里插入图片描述"><br> <img src="https://img-blog.csdnimg.cn/20200810111809215.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM4NzYyMjM3,size_16,color_FFFFFF,t_70" alt="在这里插入图片描述"></p>
<h3><a id="4Aspectj_Error38_38_java_orgspringframeworkaoptarget_121"></a>（4）报错：Aspectj Error:(38, 38) java: 程序包org.springframework.aop.target不存在</h3>
<p>问题原因是spring源码的AOP使用了aspectJ ，而java不识别aspectJ<br> 用迅雷下载（因为快）AspectJ：<a href="https://www.eclipse.org/aspectj/downloads.php">https://www.eclipse.org/aspectj/downloads.php</a><br> <img src="https://img-blog.csdnimg.cn/20200810104442940.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM4NzYyMjM3,size_16,color_FFFFFF,t_70" alt="在这里插入图片描述"><br> <img src="https://img-blog.csdnimg.cn/20200810110815268.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM4NzYyMjM3,size_16,color_FFFFFF,t_70" alt="在这里插入图片描述"></p>
<p><code>java -jar aspectj-1.9.6.jar</code> 运行下载的jar进行安装<br> <img src="https://img-blog.csdnimg.cn/20200810104807466.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM4NzYyMjM3,size_16,color_FFFFFF,t_70" alt="在这里插入图片描述"><br> <img src="https://img-blog.csdnimg.cn/20200810104827727.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM4NzYyMjM3,size_16,color_FFFFFF,t_70" alt="在这里插入图片描述"><br> <img src="https://img-blog.csdnimg.cn/2020081010484764.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM4NzYyMjM3,size_16,color_FFFFFF,t_70" alt="在这里插入图片描述"><br> ctrl + alt + shift + s<br> <img src="https://img-blog.csdnimg.cn/20200810103707851.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM4NzYyMjM3,size_16,color_FFFFFF,t_70" alt="在这里插入图片描述"><br> 添加两个</p>
<ul>
<li>AspectJ(spring.spring-aop.main)</li>
<li>AspectJ(spring.spring-aspects.main)<br> <img src="https://img-blog.csdnimg.cn/20200810103850305.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM4NzYyMjM3,size_16,color_FFFFFF,t_70" alt="在这里插入图片描述"><br> 添加之后的效果<br> <img src="https://img-blog.csdnimg.cn/20200810114728359.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM4NzYyMjM3,size_16,color_FFFFFF,t_70" alt="在这里插入图片描述"></li>
</ul>
<p>修改AspectJ编译的方式<br> <img src="https://img-blog.csdnimg.cn/20200810104959814.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM4NzYyMjM3,size_16,color_FFFFFF,t_70" alt="在这里插入图片描述"></p>
<h3><a id="5_import_orgspringframeworkaoptargetSingletonTargetSource_142"></a>（5）报错：找不到 import org.springframework.aop.target.SingletonTargetSource;</h3>
<p><img src="https://img-blog.csdnimg.cn/20200810115627320.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM4NzYyMjM3,size_16,color_FFFFFF,t_70" alt="在这里插入图片描述"><br> 首先，打开类<code>spring-aop\src\main\java\org\springframework\aop\framework\AopProxyUtils.java</code>发现报错，<br> 报错找不到<code>import org.springframework.aop.target.SingletonTargetSource;</code>，网上没人解决这个问题，我是和同时讨论之间找到解决方法的。</p>
<p>在Windows下查看该目录<code>spring-aop\src\main\java\org\springframework\aop\target</code>是存在的，但是在idea中显示不出来</p>
<p>解决方法：File–&gt;Settings–&gt;Editor–&gt;File Types–&gt;右边Ignore files and folders找到target文件名去掉即可<br> <img src="https://img-blog.csdnimg.cn/20200810134007552.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM4NzYyMjM3,size_16,color_FFFFFF,t_70" alt="在这里插入图片描述"><br> 这时，target目录出来了，但是变成了灰色，修改项目根目录下的<code>.gitignore</code>注释掉<code>target/</code>，文件则可正常使用<br> <img src="https://img-blog.csdnimg.cn/20200810134153608.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM4NzYyMjM3,size_16,color_FFFFFF,t_70" alt="在这里插入图片描述"></p>
<h1><a id="5_153"></a>5、其他相关项目整理</h1>
<h3><a id="1_154"></a>（1）强迫症修改项目名与配置名相同</h3>
<p>我们这里可以看到，后面的名字和项目名字不同，这里统一处理以下，将右侧的rootProject.name修改为以下值</p>
<pre><code class="prism language-java">rootProject<span class="token punctuation">.</span>name <span class="token operator">=</span> <span class="token string">"spring-framework-5.2.8.RELEASE"</span>
</code></pre>
<p><img src="https://img-blog.csdnimg.cn/20200810141153490.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM4NzYyMjM3,size_16,color_FFFFFF,t_70" alt="在这里插入图片描述"><br> 刷新完成之后，强迫症消失了<br> <img src="https://img-blog.csdnimg.cn/20200810141345207.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM4NzYyMjM3,size_16,color_FFFFFF,t_70" alt="在这里插入图片描述"></p>
<h3><a id="2github_162"></a>（2）上传项目到github/码云</h3>
<p>先使用github/码云创建仓库地址，然后拿到仓库地址，例如：</p>
<pre><code class="prism language-java">https<span class="token operator">:</span><span class="token operator">/</span><span class="token operator">/</span>github<span class="token punctuation">.</span>com<span class="token operator">/</span>Tellsea<span class="token operator">/</span>spring<span class="token operator">-</span>framework<span class="token operator">-</span><span class="token number">5.2</span><span class="token number">.8</span><span class="token punctuation">.</span>RELEASE<span class="token punctuation">.</span>git
</code></pre>
<p>把项目构建成git仓库<br> <img src="https://img-blog.csdnimg.cn/20200810141622937.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM4NzYyMjM3,size_16,color_FFFFFF,t_70" alt="在这里插入图片描述"><br> <img src="https://img-blog.csdnimg.cn/20200810141644336.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM4NzYyMjM3,size_16,color_FFFFFF,t_70" alt="在这里插入图片描述"><br> 现在所有文件为红色，然后通过右键项目名，git，add，把所有文件变成绿色<br> <img src="https://img-blog.csdnimg.cn/20200810141714103.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM4NzYyMjM3,size_16,color_FFFFFF,t_70" alt="在这里插入图片描述"><br> 然后提交文件到缓存区，过程可能慢一点，因为文件数量有点大<br> <img src="https://img-blog.csdnimg.cn/2020081014195958.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM4NzYyMjM3,size_16,color_FFFFFF,t_70" alt="在这里插入图片描述"><br> <img src="https://img-blog.csdnimg.cn/20200810142050671.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM4NzYyMjM3,size_16,color_FFFFFF,t_70" alt="在这里插入图片描述"><br> 提交到缓存区之后，本地文件变成白色，但是线上的代码仓库还没有代码，我们还需要将缓存区提交到线上<br> <img src="https://img-blog.csdnimg.cn/2020081014312813.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM4NzYyMjM3,size_16,color_FFFFFF,t_70" alt="在这里插入图片描述"><br> 填写第一步创建的线上仓库地址，然后点击提交即可</p>
<h1><a id="_179"></a>微信公众号</h1>
<p><img src="https://img-blog.csdnimg.cn/20210317114147258.jpg#pic_center" alt="每天Get一个小技巧"></p>
</div></span>
</div>
<div style="float:right;">
<div class="article-copyright">
<span class="creativecommons"> <a rel="license" href="https://creativecommons.org/licenses/by-sa/4.0/"> </a> <span>
版权声明：本文为博主原创文章，遵循<a href="https://creativecommons.org/licenses/by-sa/4.0/" target="_blank" rel="noopener"> CC 4.0 BY-SA </a>版权协议，转载请附上原文出处链接和本声明。
</span>
<div class="article-source-link2222">
本文链接：<a href="https://blog.csdn.net/qq_38762237/article/details/107815524">https://blog.csdn.net/qq_38762237/article/details/107815524</a>
</div>
</span>
</div>
</div>
<div style="clear:both;"></div>
<div id="cprt" style="float:right;font-size:12px;padding-top:15px;">
<a href="/copyright" rel="nofollow,noindex" target="_blank">原作者删帖</a>&nbsp;&nbsp;
<a href="/copyright" rel="nofollow,noindex" target="_blank">不实内容删帖</a>&nbsp;&nbsp;
<a href="/copyright" title="投诉本文含广告或垃圾信息">广告或垃圾文章投诉</a>
</div>
<div style="clear:both;"></div>
<hr>

<div id="82741-11"><script src="//ads.themoneytizer.com/s/gen.js?type=11"></script><script src="//ads.themoneytizer.com/s/requestform.js?siteId=82741&formatId=11"></script></div>
<h3><span>智能推荐</span></h3>
<div>
</div>

<div id="82741-11"><script src="//ads.themoneytizer.com/s/gen.js?type=11"></script><script src="//ads.themoneytizer.com/s/requestform.js?siteId=82741&formatId=11"></script></div>
<h3><span>随便推点</span></h3>
<div>
</div>
<div id="bottomads">
</div>
</div>
<div class="col-md-4">

<div id="82741-2"><script src="//ads.themoneytizer.com/s/gen.js?type=2"></script><script src="//ads.themoneytizer.com/s/requestform.js?siteId=82741&formatId=2"></script></div>
<h3>
<span>推荐文章</span>
</h3>
<div style="padding:5px 5px 0px 5px;word-wrap: break-word; word-break: normal;">
<ul style="list-style: none;padding-left:0px;">
<li style="padding-top: 6px;padding-bottom: 6px;border-bottom:1px solid #EBEBEB;line-height:20px;">
<a href="/article/weixin_30344131/96876757">Springboot配置多数据源（Mysql和Orcale）--（Idea Maven JDBCTemplate支持下的）_weixin_30344131的博客-程序员宅基地</a></li>
</ul>
<ul style="list-style: none;padding-left:0px;">
<li style="padding-top: 6px;padding-bottom: 6px;border-bottom:1px solid #EBEBEB;line-height:20px;">
<a href="/article/weixin_34008933/90688715">Linux查找find命令详解_weixin_34008933的博客-程序员宅基地</a></li>
</ul>
<ul style="list-style: none;padding-left:0px;">
<li style="padding-top: 6px;padding-bottom: 6px;border-bottom:1px solid #EBEBEB;line-height:20px;">
<a href="/article/u010926630/9036633">【Linux基础】用Gdb调试有问题的程序_u010926630的专栏-程序员宅基地</a></li>
</ul>
<ul style="list-style: none;padding-left:0px;">
<li style="padding-top: 6px;padding-bottom: 6px;border-bottom:1px solid #EBEBEB;line-height:20px;">
<a href="/article/weixin_33972649/93864403">毕业三年_weixin_33972649的博客-程序员宅基地</a></li>
</ul>
<ul style="list-style: none;padding-left:0px;">
<li style="padding-top: 6px;padding-bottom: 6px;border-bottom:1px solid #EBEBEB;line-height:20px;">
<a href="/article/Fu_Monkey/107406463">react 报错0.chunk.js:449884 Warning: Can‘t perform a React state update on an unmounted component. Thi_CSDN_Alisa的博客-程序员宅基地</a></li>
</ul>
<ul style="list-style: none;padding-left:0px;">
<li style="padding-top: 6px;padding-bottom: 6px;border-bottom:1px solid #EBEBEB;line-height:20px;">
<a href="/article/onlyyjco/52678964">java 8 新特性（4.Stream API）_onlyyjco的专栏-程序员宅基地</a></li>
</ul>
<ul style="list-style: none;padding-left:0px;">
<li style="padding-top: 6px;padding-bottom: 6px;border-bottom:1px solid #EBEBEB;line-height:20px;">
<a href="/article/qq_42739591/109313050">十行Python代码写一个聊天机器人_柠檬味的cat的博客-程序员宅基地</a></li>
</ul>
<ul style="list-style: none;padding-left:0px;">
<li style="padding-top: 6px;padding-bottom: 6px;border-bottom:1px solid #EBEBEB;line-height:20px;">
<a href="/article/lostgdi/9392281">驱动精灵锁定www.duba.com首页无法更改_lostgdi的专栏-程序员宅基地</a></li>
</ul>
</div>

<div id="82741-3"><script src="//ads.themoneytizer.com/s/gen.js?type=3"></script><script src="//ads.themoneytizer.com/s/requestform.js?siteId=82741&formatId=3"></script></div>
<h3>
<span>热门文章</span>
</h3>
<div style="padding:5px 5px 0px 5px;word-wrap: break-word; word-break: normal;">
<ul style="list-style: none;padding-left:0px;">
<li style="padding-top: 6px;padding-bottom: 6px;border-bottom:1px solid #EBEBEB;line-height:20px;">
<a href="/article/weixin_39831170/117655598">android x86debug,Debug HowTo | Android-x86_weixin_39831170的博客-程序员宅基地</a></li>
</ul>
<ul style="list-style: none;padding-left:0px;">
<li style="padding-top: 6px;padding-bottom: 6px;border-bottom:1px solid #EBEBEB;line-height:20px;">
<a href="/article/u013617144/79622930">【LINQ】Where 与TakeWhile的区别_NopDes1re的专栏-程序员宅基地</a></li>
</ul>
<ul style="list-style: none;padding-left:0px;">
<li style="padding-top: 6px;padding-bottom: 6px;border-bottom:1px solid #EBEBEB;line-height:20px;">
<a href="/article/feixiangsmile/100810374">基于chatterbot的入门运行介绍_feixiangsmile的博客-程序员宅基地</a></li>
</ul>
<ul style="list-style: none;padding-left:0px;">
<li style="padding-top: 6px;padding-bottom: 6px;border-bottom:1px solid #EBEBEB;line-height:20px;">
<a href="/article/weixin_33882443/93613703">Thread.Sleep在WinRT中---uwp应用_weixin_33882443的博客-程序员宅基地</a></li>
</ul>
<ul style="list-style: none;padding-left:0px;">
<li style="padding-top: 6px;padding-bottom: 6px;border-bottom:1px solid #EBEBEB;line-height:20px;">
<a href="/article/weixin_30617695/99496416">模板库_weixin_30617695的博客-程序员宅基地</a></li>
</ul>
<ul style="list-style: none;padding-left:0px;">
<li style="padding-top: 6px;padding-bottom: 6px;border-bottom:1px solid #EBEBEB;line-height:20px;">
<a href="/article/Jun5008/118581011">gradle-7.1.1-all 百度网盘下载_Jun5008的博客-程序员宅基地</a></li>
</ul>
<ul style="list-style: none;padding-left:0px;">
<li style="padding-top: 6px;padding-bottom: 6px;border-bottom:1px solid #EBEBEB;line-height:20px;">
<a href="/article/weixin_48606170/116496643">SQL语句 逗号拆分与逗号拼接_扶de起的阿斗 的博客-程序员宅基地</a></li>
</ul>
<ul style="list-style: none;padding-left:0px;">
<li style="padding-top: 6px;padding-bottom: 6px;border-bottom:1px solid #EBEBEB;line-height:20px;">
<a href="/article/YiGE_snail/117978439">JavaWeb 后端 &lt;十一&gt; 之 DBUtils 框架 （基本使用 结果集 事务处理 对表读取）_YiGE_snail的专栏-程序员宅基地</a></li>
</ul>
</div>

<div id="82741-20"><script src="//ads.themoneytizer.com/s/gen.js?type=20"></script><script src="//ads.themoneytizer.com/s/requestform.js?siteId=82741&formatId=20"></script></div>
<h3>
<span>相关标签</span>
</h3>
<div style="padding:5px 5px 0px 5px;word-wrap: break-word; word-break: normal;">
</div>
<div id="mbads-sider">
</div>

<div id="82741-19"><script src="//ads.themoneytizer.com/s/gen.js?type=19"></script><script src="//ads.themoneytizer.com/s/requestform.js?siteId=82741&formatId=19"></script></div>
</div>
<div id="82741-28"><script src="//ads.themoneytizer.com/s/gen.js?type=28"></script><script src="//ads.themoneytizer.com/s/requestform.js?siteId=82741&formatId=28"></script></div>
<div id="82741-6"><script src="//ads.themoneytizer.com/s/gen.js?type=6"></script><script src="//ads.themoneytizer.com/s/requestform.js?siteId=82741&formatId=6"></script></div>
<div id="82741-5"><script src="//ads.themoneytizer.com/s/gen.js?type=5"></script><script src="//ads.themoneytizer.com/s/requestform.js?siteId=82741&formatId=5"></script></div>
</div>
</div>

<footer>
<div class="footer-sec" id="footer-sec">
<div class="container">
<div class="row">
<script type="text/javascript">document.write(unescape("%3Cspan id='cnzz_stat_icon_1279778326'%3E%3C/span%3E%3Cscript src='https://s9.cnzz.com/z_stat.php%3Fid%3D1279778326%26online%3D1%26show%3Dline' type='text/javascript'%3E%3C/script%3E"));</script>
<div class="col-md-12 foo-inner">
Copyright &copy; 2018-2021 - All Rights Reserved - <a th:href="${domain}" th:text="${domain}" style="color:white;"></a> <span style="color:red;">网站内容人工审核和清理中！</span>
</div>
</div>
</div>
</div>

</footer>

</body>
</html>
```