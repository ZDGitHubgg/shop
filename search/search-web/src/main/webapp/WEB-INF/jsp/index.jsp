<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/3/30
  Time: 11:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="zh-CN" xml:lang="zh-CN">
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=Edge" />
    <meta charset="UTF-8" />
    <title>【手机及手机相关产品】-天天商城</title>
    <meta name="viewport" content="width=1226" />
    <meta name="description" content="手机的检索结果，小米官方网站包含手机价格及手机适配机型，官方推荐手机产品，帮助米粉挑选合适自己的手机商品。" />
    <meta name="keywords" content="手机" />
    <meta name="robots" content="noindex"/>
    <link rel="shortcut icon" href="//s01.mifile.cn/favicon.ico" type="image/x-icon" />
    <link rel="icon" href="//s01.mifile.cn/favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" href="css/base.min.css" />
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <link rel="stylesheet" href="css/list.min.css" />
    <script type="text/javascript">var _head_over_time = (new Date()).getTime();</script>
</head>
<body>
<div class="site-topbar">
    <div class="container">
        <div class="topbar-nav">
            <a rel="nofollow" href="//www.mi.com/index.html" >天天商城</a><span class="sep">|</span><a rel="nofollow" href="https://i.mi.com/" target="_blank">云服务</a><span class="sep">|</span></span><a rel="nofollow" href="https://youpin.mi.com/" target="_blank">品质</a><span class="sep">|</span><a rel="nofollow" href="#J_modal-globalSites" data-toggle="modal">性价比</a>        </div>
        <div class="topbar-cart" id="J_miniCartTrigger">
            <a class="cart-mini" id="J_miniCartBtn" href="//static.mi.com/cart/"><i class="iconfont">&#xe60c;</i>购物车<span class="cart-mini-num J_cartNum"></span></a>
            <div class="cart-menu" id="J_miniCartMenu">
                <div class="loading"><div class="loader"></div></div>
            </div>
        </div>
        <div class="topbar-info" id="J_userInfo">
            <a class="link" href="//order.mi.com/site/login" data-needlogin="true">登录</a><span class="sep">|</span><a class="link" href="https://account.xiaomi.com/pass/register" >注册</a>        </div>
    </div>
</div>
<div class="site-header">
    <div class="container">
        <div class="header-logo">
            <%--<a class="logo ir" href="//www.mi.com/index.html" title="小米官网">小米官网</a>--%>
        </div>
        <div class="header-nav">
            <ul class="nav-list J_navMainList clearfix">
                <li id="J_navCategory" class="nav-category">
                    <a class="link-category" href="//list.mi.com"><span class="text">全部商品分类</span></a>
                </li>
                <li class="nav-item">
                    <a class="link" href="javascript: void(0);"><span class="text">手机</span><span class="arrow"></span></a>
                    <div class="item-children">
                        <div class="container">
                            <ul class="children-list clearfix">
                                <li class="first">
                                    <div class="figure figure-thumb">
                                        <a href="https://www.mi.com/mix2/"><img src="picture/placeholder-220!110x110_1.png" data-src="//i1.mifile.cn/f/i/g/2015/cn-index/mix2320-220.png"   alt="小米MIX 2" width="160" height="110" /></a>
                                    </div>
                                    <div class="title"><a href="https://www.mi.com/mix2/">小米MIX 2</a></div>
                                    <p class="price">3099元</p>                                    <div class="flags"><div class="flag">热卖</div></div>                                </li>
                                <li>
                                    <div class="figure figure-thumb">
                                        <a href="https://www.mi.com/minote3/"><img src="picture/placeholder-220!110x110_1.png" data-src="//i1.mifile.cn/f/i/g/2015/cn-index/note2320x220.png"   alt="小米Note 3" width="160" height="110" /></a>
                                    </div>
                                    <div class="title"><a href="https://www.mi.com/minote3/">小米Note 3</a></div>
                                    <p class="price">1799元</p>                                    <div class="flags"><div class="flag">热卖</div></div>                                </li>
                                <li>
                                    <div class="figure figure-thumb">
                                        <a href="//www.mi.com/mi6/"><img src="picture/placeholder-220!110x110_1.png" data-src="//i1.mifile.cn/f/i/g/2015/cn-index/xm6-320.png"   alt="小米6" width="160" height="110" /></a>
                                    </div>
                                    <div class="title"><a href="//www.mi.com/mi6/">小米6</a></div>
                                    <p class="price">2299元起</p>                                                                    </li>
                                <li>
                                    <div class="figure figure-thumb">
                                        <a href="//www.mi.com/max2/"><img src="picture/placeholder-220!110x110_1.png" data-src="//i1.mifile.cn/f/i/g/2015/cn-index/max2_toubu.png"   alt="小米Max 2" width="160" height="110" /></a>
                                    </div>
                                    <div class="title"><a href="//www.mi.com/max2/">小米Max 2</a></div>
                                    <p class="price">1399元起</p>                                                                    </li>
                                <li>
                                    <div class="figure figure-thumb">
                                        <a href="//www.mi.com/mi5x/"><img src="picture/placeholder-220!110x110_1.png" data-src="//i1.mifile.cn/f/i/g/2015/5x-2.jpg"   alt="小米5X" width="160" height="110" /></a>
                                    </div>
                                    <div class="title"><a href="//www.mi.com/mi5x/">小米5X</a></div>
                                    <p class="price">1299元起</p>                                                                    </li>
                            </ul>
                        </div>
                    </div>
                </li>

                <%--电脑--%>
                <li class="nav-item">
                    <a class="link" href="javascript: void(0);"><span class="text">电脑</span><span class="arrow"></span></a>
                    <div class="item-children">
                        <div class="container">
                            <ul class="children-list clearfix">
                                <li class="first">
                                    <div class="figure figure-thumb">
                                        <a href="https://www.mi.com/redminote5"><img src="picture/placeholder-220!110x110_1.png" data-src="//i1.mifile.cn/f/i/g/2015/cn-index/note5-320-220.png"   alt="红米Note 5" width="160" height="110" /></a>
                                    </div>
                                    <div class="title"><a href="https://www.mi.com/redminote5">红米Note 5</a></div>
                                    <p class="price">1099元起</p>                                    <div class="flags"><div class="flag">新品</div></div>                                </li>
                                <li>
                                    <div class="figure figure-thumb">
                                        <a href="https://www.mi.com/redmi5/"><img src="picture/placeholder-220!110x110_1.png" data-src="//i1.mifile.cn/f/i/g/2015/cn-index/5P-320-220.png"   alt="红米5 Plus" width="160" height="110" /></a>
                                    </div>
                                    <div class="title"><a href="https://www.mi.com/redmi5/">红米5 Plus</a></div>
                                    <p class="price">999元起</p>                                    <div class="flags"><div class="flag">热卖</div></div>                                </li>
                                <li>
                                    <div class="figure figure-thumb">
                                        <a href="https://www.mi.com/redmi5/"><img src="picture/placeholder-220!110x110_1.png" data-src="//i1.mifile.cn/f/i/g/2015/cn-index/5-320-220.png"   alt="红米5" width="160" height="110" /></a>
                                    </div>
                                    <div class="title"><a href="https://www.mi.com/redmi5/">红米5</a></div>
                                    <p class="price">799元起</p>                                    <div class="flags"><div class="flag">热卖</div></div>                                </li>
                                <li>
                                    <div class="figure figure-thumb">
                                        <a href="https://www.mi.com/redmi5a/"><img src="picture/placeholder-220!110x110_1.png" data-src="//i1.mifile.cn/f/i/g/2015/cn-index/320-220-1.png"   alt="红米5A" width="160" height="110" /></a>
                                    </div>
                                    <div class="title"><a href="https://www.mi.com/redmi5a/">红米5A</a></div>
                                    <p class="price">599元起</p>                                    <div class="flags"><div class="flag">热卖</div></div>                                </li>
                                <li>
                                    <div class="figure figure-thumb">
                                        <a href="//www.mi.com/redminote5a/"><img src="picture/placeholder-220!110x110_1.png" data-src="//i1.mifile.cn/f/i/g/2015/cn-index/3205a.png"   alt="红米Note 5A 标准版" width="160" height="110" /></a>
                                    </div>
                                    <div class="title"><a href="//www.mi.com/redminote5a/">红米Note 5A 标准版</a></div>
                                    <p class="price">669元</p>                                                                    </li>
                                <li>
                                    <div class="figure figure-thumb">
                                        <a href="https://www.mi.com/redminote5as/"><img src="picture/placeholder-220!110x110_1.png" data-src="//i1.mifile.cn/f/i/g/2015/320-220.jpg"   alt="红米Note 5A 高配版" width="160" height="110" /></a>
                                    </div>
                                    <div class="title"><a href="https://www.mi.com/redminote5as/">红米Note 5A 高配版</a></div>
                                    <p class="price">899元</p>                                                                    </li>
                            </ul>
                        </div>
                    </div>
                </li>

                <%--U盘--%>
                <li class="nav-item">
                    <a class="link" href="javascript: void(0);"><span class="text">U盘</span><span class="arrow"></span></a>
                    <div class="item-children">
                        <div class="container">
                            <ul class="children-list clearfix">
                                <li class="first">
                                    <div class="figure figure-thumb">
                                        <a href="//www.mi.com/mitv4A/40/"><img src="picture/placeholder-220!110x110_1.png" data-src="//i1.mifile.cn/f/i/g/2015/cn-index/4a40320_220png.png"   alt="小米电视4A 40英寸" width="160" height="110" /></a>
                                    </div>
                                    <div class="title"><a href="//www.mi.com/mitv4A/40/">小米电视4A 40英寸</a></div>
                                    <p class="price">1599元</p>                                    <div class="flags"><div class="flag">新品</div></div>                                </li>
                                <li>
                                    <div class="figure figure-thumb">
                                        <a href="https://www.mi.com/mitv4A/32/"><img src="picture/placeholder-220!110x110_1.png" data-src="//i1.mifile.cn/f/i/g/2015/cn-index/daohang.png"   alt="小米电视4A 32英寸" width="160" height="110" /></a>
                                    </div>
                                    <div class="title"><a href="https://www.mi.com/mitv4A/32/">小米电视4A 32英寸</a></div>
                                    <p class="price">999元</p>                                    <div class="flags"><div class="flag">热卖</div></div>                                </li>
                                <li>
                                    <div class="figure figure-thumb">
                                        <a href="//www.mi.com/mitv4A/43/"><img src="picture/placeholder-220!110x110_1.png" data-src="//i1.mifile.cn/f/i/g/2015/cn-index/320_43.png"   alt="小米电视4A 43英寸" width="160" height="110" /></a>
                                    </div>
                                    <div class="title"><a href="//www.mi.com/mitv4A/43/">小米电视4A 43英寸</a></div>
                                    <p class="price">1799元</p>                                    <div class="flags"><div class="flag">热卖</div></div>                                </li>
                                <li>
                                    <div class="figure figure-thumb">
                                        <a href="//www.mi.com/mitv4A/55/"><img src="picture/placeholder-220!110x110_1.png" data-src="//i1.mifile.cn/f/i/g/2015/cn-index/4a55mi320_220png.png"   alt="小米电视4A 55英寸" width="160" height="110" /></a>
                                    </div>
                                    <div class="title"><a href="//www.mi.com/mitv4A/55/">小米电视4A 55英寸</a></div>
                                    <p class="price">2699元</p>                                    <div class="flags"><div class="flag">热卖</div></div>                                </li>
                                <li>
                                    <div class="figure figure-thumb">
                                        <a href="//www.mi.com/mitv4/55/"><img src="picture/placeholder-220!110x110_1.png" data-src="//i1.mifile.cn/f/i/g/2015/cn-index/xmds_55.png"   alt="小米电视4 55英寸" width="160" height="110" /></a>
                                    </div>
                                    <div class="title"><a href="//www.mi.com/mitv4/55/">小米电视4 55英寸</a></div>
                                    <p class="price">3999元</p>                                    <div class="flags"><div class="flag">超薄旗舰</div></div>                                </li>
                                <li>
                                    <div class="figure figure-thumb">
                                        <a href="https://www.mi.com/p/1995.html"><img src="picture/placeholder-220!110x110_1.png" data-src="//i1.mifile.cn/f/i/g/2015/cn-index/465.png"   alt="查看全部<br/>小米电视" width="160" height="110" /></a>
                                    </div>
                                    <div class="title"><a href="https://www.mi.com/p/1995.html">查看全部<br/>小米电视</a></div>
                                </li>
                            </ul>
                        </div>
                    </div>
                </li>

                <%--内存条--%>
                <li class="nav-item">
                    <a class="link" href="javascript: void(0);"><span class="text">内存条</span><span class="arrow"></span></a>
                    <div class="item-children">
                        <div class="container">
                            <ul class="children-list clearfix">
                                <li class="first">
                                    <div class="figure figure-thumb">
                                        <a href="//www.mi.com/mibookair-12/"><img src="picture/placeholder-220!110x110_1.png" data-src="//i1.mifile.cn/f/i/g/2015/video/bijiben32012.5.jpg"   alt="小米笔记本Air 12.5"" width="160" height="110" /></a>
                                    </div>
                                    <div class="title"><a href="//www.mi.com/mibookair-12/">小米笔记本Air 12.5"</a></div>
                                    <p class="price">3599元</p>                                                                    </li>
                                <li>
                                    <div class="figure figure-thumb">
                                        <a href="//www.mi.com/mibookair-13/"><img src="picture/placeholder-220!110x110_1.png" data-src="//i1.mifile.cn/f/i/g/2015/cn-index/320x220-44.png"   alt="小米笔记本Air 13.3" 四核增强" width="160" height="110" /></a>
                                    </div>
                                    <div class="title"><a href="//www.mi.com/mibookair-13/">小米笔记本Air 13.3" 四核增强</a></div>
                                    <p class="price">5399元</p>                                                                    </li>
                                <li>
                                    <div class="figure figure-thumb">
                                        <a href="//www.mi.com/mibookair/"><img src="picture/placeholder-220!110x110_1.png" data-src="//i1.mifile.cn/f/i/g/2015/cn-index/bijiben320.jpg"   alt="小米笔记本Air 13.3" 独显" width="160" height="110" /></a>
                                    </div>
                                    <div class="title"><a href="//www.mi.com/mibookair/">小米笔记本Air 13.3" 独显</a></div>
                                    <p class="price">5199元</p>                                                                    </li>
                                <li>
                                    <div class="figure figure-thumb">
                                        <a href="https://www.mi.com/mibookair-13in/"><img src="picture/placeholder-220!110x110_1.png" data-src="//i1.mifile.cn/f/i/g/2015/cn-index/bijiben320.jpg"   alt="小米笔记本Air 13.3" 集显" width="160" height="110" /></a>
                                    </div>
                                    <div class="title"><a href="https://www.mi.com/mibookair-13in/">小米笔记本Air 13.3" 集显</a></div>
                                    <p class="price">4599元起</p>                                                                    </li>
                                <li>
                                    <div class="figure figure-thumb">
                                        <a href="//www.mi.com/mibookpro/"><img src="picture/placeholder-220!110x110_1.png" data-src="//i1.mifile.cn/f/i/g/2015/cn-index/WechatIMG603.png"   alt="小米笔记本Pro 15.6"" width="160" height="110" /></a>
                                    </div>
                                    <div class="title"><a href="//www.mi.com/mibookpro/">小米笔记本Pro 15.6"</a></div>
                                    <p class="price">5599元起</p>                                                                    </li>
                            </ul>
                        </div>
                    </div>
                </li>
            </ul>
        </div>
        <div class="header-search">
            <form id="J_searchForm" class="search-form clearfix" action="#" method="get">
                <label for="search" class="hide">站内搜索</label>
                <input class="search-text" type="search" id="search" name="keyword" autocomplete="off" data-search-config={'defaultWords':[{'Key':'小米手机6','Rst':29},{'Key':'小米手机5X','Rst':8},{'Key':'红米note&nbsp;4X','Rst':14},{'Key':'红米手机4X','Rst':9},{'Key':'小米Max&nbsp;2','Rst':5},{'Key':'小米电视4C','Rst':2},{'Key':'电视32英寸','Rst':1},{'Key':'笔记本pro','Rst':3},{'Key':'空气净化器','Rst':17},{'Key':'净水器','Rst':9}]} />
                <input type="button" id="btnSubmit" class="search-btn iconfont" value="&#xe616;" />
                <div class="search-hot-words">
                    <a href="https://item.mi.com/product/10000084.html">红米Note 5</a><a href="https://www.mi.com/mix2/">小米MIX 2</a>                </div>
            </form>
        </div>
    </div>
</div>
<div class="breadcrumbs">
    <div class="container">
        <a href='http://localhost:82/shop/index'>首页</a><span class="sep">&gt;</span><a href="//search.mi.com/search_手机">全部结果</a><span class="sep">&gt;</span><span>手机</span>    </div>
</div>

<div class="content">
    <div class="container">
        <div class="order-list-box clearfix">
            <ul class="order-list">
                <li class="active first"><a href="//search.mi.com/search_手机-0-0-0-0-0-0-0-0-1" rel="nofollow">推荐</a></li>
                <li ><a href="//search.mi.com/search_手机-0-0-0-0-1-0-0-0-1" rel="nofollow">新品</a></li>
                <li class="up"><a href="//search.mi.com/search_手机-0-0-0-0-10-0-0-0-1" rel="nofollow">价格 <i class="iconfont">&#xe62f;</i></a></li>
                <li ><a href="//search.mi.com/search_手机-0-0-0-0-3-0-0-0-1" rel="nofollow">评论最多</a></li>
            </ul>
            <ul class="type-list">
                <li><a href="//search.mi.com/search_手机-0-0-0-0-0-0-0-1-1"><span class="checkbox"><i class="iconfont">&#x221a;</i></span>查看评价</a></li>
                <li><a href="//search.mi.com/search_手机-0-0-0-0-0-0-1-0-1"  rel="nofollow"><span class="checkbox"><i class="iconfont">&#x221a;</i></span>仅显示特惠商品</a></li>
                <li><a href="//search.mi.com/search_手机-0-0-0-0-0-1-0-0-1"  rel="nofollow"><span class="checkbox"><i class="iconfont">&#x221a;</i></span>仅显示有货商品</a></li>
            </ul>
        </div>
        <div class="goods-list-box">
            <div class="goods-list clearfix">
                <div class="goods-item" data-productid="7758">
                    <div class="figure figure-img">
                        <a href="//item.mi.com/1180900015.html?cfrom=search"><img src="picture/pms_1520477459.57598365!200x200.jpg" width="200" height="200" alt="" /></a>
                    </div>
                    <p class="desc"></p>                    <h2 class="title"><a href="//item.mi.com/1180900015.html?cfrom=search">红米5A 全网通版 3GB内存 32GB</a></h2>
                    <p class="price"></p>
                    <div class="thumbs">
                        <ul class="thumb-list">
                            <li data-commodityid="1180900015" data-config='{"cid":"1180900015","gid":"2180900012","discount":"0","price":"699\u5143","new":0,"is-cos":0,"package":0,"hasgift":0,"postfree":0,"postfreenum":1,"cfrom":"search"}'><a><img src="picture/pms_1520477459.57598365!34x34.jpg" width="34" height="34" title="红米5A 全网通版 3GB内存 32GB 香槟金" alt="红米5A 全网通版 3GB内存 32GB 香槟金" /></a></li><li data-commodityid="1180900016" data-config='{"cid":"1180900016","gid":"2180900013","discount":"0","price":"699\u5143","new":0,"is-cos":0,"package":0,"hasgift":0,"postfree":0,"postfreenum":1,"cfrom":"search"}'><a><img src="picture/pms_1520477464.13273351!34x34.jpg" width="34" height="34" title="红米5A 全网通版 3GB内存 32GB  铂银灰" alt="红米5A 全网通版 3GB内存 32GB  铂银灰" /></a></li><li data-commodityid="1180900017" data-config='{"cid":"1180900017","gid":"2180900014","discount":"0","price":"699\u5143","new":0,"is-cos":0,"package":0,"hasgift":0,"postfree":0,"postfreenum":1,"cfrom":"search"}'><a><img src="picture/pms_1520477466.23587823!34x34.jpg" width="34" height="34" title="红米5A 全网通版 3GB内存 32GB 樱花粉" alt="红米5A 全网通版 3GB内存 32GB 樱花粉" /></a></li><li data-commodityid="1180900018" data-config='{"cid":"1180900018","gid":"2180900015","discount":"0","price":"699\u5143","new":0,"is-cos":1,"package":0,"hasgift":0,"postfree":0,"postfreenum":1,"cfrom":"search"}'><a><img src="picture/pms_1520571848.28333634!34x34.jpg" width="34" height="34" title="红米5A 全网通版 3GB内存 32GB 浅蓝色" alt="红米5A 全网通版 3GB内存 32GB 浅蓝色" /></a></li>                        </ul>
                    </div>
                    <div class="actions clearfix">
                        <a class="btn-like J_likeGoods" data-cid="1180900015" href="javascript: void(0);"><i class="iconfont">&#xe62d;</i> <span>喜欢</span></a>
                        <a class="btn-buy J_buyGoods" data-gid="2180900012" href="//cart.mi.com/cart/add/2180900012-0-1"><span>加入购物车</span> <i class="iconfont">&#xe60a;</i></a>                    </div>
                    <div class="flags">
                    </div>
                    <div class="notice"></div>
                </div>

                <c:forEach items="${list}" var="list">
                    <div class="goods-item" data-productid="7758">
                        <div class="figure figure-img">
                            <a href="https://item.mi.com/product/10000069.html?cfrom=search"><img src="picture/pms_1505110879.90398489!200x200.jpg" width="200" height="200" alt="" /></a>
                        </div>
                        <p class="desc"></p>                    <h2 class="title"><a href="https://item.mi.com/product/10000069.html?cfrom=search">${list.proDesc}</a></h2>
                        <p class="price">${list.proPrice}元 <del>${list.proPrice}元</del></p>
                        <div class="thumbs">
                            <ul class="thumb-list">
                                <li data-commodityid="1173500017" data-config='{"cid":"1173500017","gid":"2173500021","discount":"9.2","price":"2099\u5143 <del>2299\u5143<\/del>","new":0,"is-cos":0,"package":0,"hasgift":1,"postfree":0,"postfreenum":1,"cfrom":"search"}'><a><img src="${list.proImage}" width="34" height="34" title="小米Note 3 全网通版 6GB内存 黑色" alt="小米Note 3 全网通版 6GB内存 黑色" /></a></li><li data-commodityid="1173800030" data-config='{"cid":"1173800030","gid":"2173800014","discount":"9.2","price":"2099\u5143 <del>2299\u5143<\/del>","new":0,"is-cos":0,"package":0,"hasgift":1,"postfree":0,"postfreenum":1,"cfrom":"search"}'><a><img src="picture/pms_1505903266.08411470!34x34.jpg" width="34" height="34" title="小米Note 3 全网通版 6GB内存 亮蓝色" alt="小米Note 3 全网通版 6GB内存 亮蓝色" /></a></li>                        </ul>
                        </div>
                        <div class="actions clearfix">
                            <a class="btn-like J_likeGoods" data-cid="1173500017" href="javascript: void(0);"><i class="iconfont">&#xe62d;</i> <span>喜欢</span></a>
                            <a class="btn-buy J_buyGoods" data-gid="2173500021" href="//cart.mi.com/cart/add/2173500021-0-1"><span>加入购物车</span> <i class="iconfont">&#xe60a;</i></a>                    </div>
                        <div class="flags">
                            <div class="flag flag-saleoff">9.2折促销</div><div class="flag flag-gift">有赠品${list.catName}</div>                    </div>
                        <div class="notice"></div>
                    </div>
                </c:forEach>



            </div>
            <div class="xm-pagenavi">
                <span class="numbers first iconfont">&#xe629;</span><span class="numbers current">1</span><a class="numbers" href="//search.mi.com/search_手机-0-0-0-0-0-0-0-0-2">2</a><a class="numbers" href="//search.mi.com/search_手机-0-0-0-0-0-0-0-0-3">3</a><a class="numbers last iconfont" href="//search.mi.com/search_手机-0-0-0-0-0-0-0-0-2">&#xe624;</a>            </div>
        </div>
    </div>
</div>

<div class="site-footer">
    <div class="container">
        <div class="footer-service">
            <ul class="list-service clearfix">
                <li><a rel="nofollow" href="//www.mi.com/static/fast/" target="_blank"><i class="iconfont">&#xe634;</i>预约维修服务</a></li>
                <li><a rel="nofollow" href="//www.mi.com/service/exchange#back" target="_blank"><i class="iconfont">&#xe635;</i>7天无理由退货</a></li>
                <li><a rel="nofollow" href="//www.mi.com/service/exchange#back" target="_blank"><i class="iconfont">&#xe636;</i>15天免费换货</a></li>
                <li><a rel="nofollow" href="//www.mi.com/service/buy/postage/" target="_blank"><i class="iconfont">&#xe638;</i>满150元包邮</a></li>
                <li><a rel="nofollow" href="//www.mi.com/static/maintainlocation/" target="_blank"><i class="iconfont">&#xe637;</i>520余家售后网点</a></li>
            </ul>
        </div>
        <div class="footer-links clearfix">

            <dl class="col-links col-links-first">
                <dt>帮助中心</dt>

                <dd><a rel="nofollow" href="//www.mi.com/service/account/register/"   target="_blank">账户管理</a></dd>

                <dd><a rel="nofollow" href="//www.mi.com/service/buy/buytime/"   target="_blank">购物指南</a></dd>

                <dd><a rel="nofollow" href="//www.mi.com/service/order/sendprogress/"   target="_blank">订单操作</a></dd>

            </dl>

            <dl class="col-links ">
                <dt>服务支持</dt>

                <dd><a rel="nofollow" href="//www.mi.com/service/exchange"   target="_blank">售后政策</a></dd>

                <dd><a rel="nofollow" href="//www.mi.com/service/"   target="_blank">自助服务</a></dd>

                <dd><a rel="nofollow" href="//www.mi.com/c/service/download/"   target="_blank">相关下载</a></dd>

            </dl>

            <dl class="col-links ">
                <dt>线下门店</dt>

                <dd><a rel="nofollow" href="//www.mi.com/c/xiaomizhijia/"   target="_blank">小米之家</a></dd>

                <dd><a rel="nofollow" href="//www.mi.com/static/maintainlocation/"   target="_blank">服务网点</a></dd>

                <dd><a rel="nofollow" href="//www.mi.com/static/familyLocation/"   target="_blank">零售网点</a></dd>

            </dl>

            <dl class="col-links ">
                <dt>关于小米</dt>

                <dd><a rel="nofollow" href="//www.mi.com/about/"   target="_blank">了解小米</a></dd>

                <dd><a rel="nofollow" href="http://hr.xiaomi.com/"   target="_blank">加入小米</a></dd>

                <dd><a rel="nofollow" href="//www.mi.com/about/contact/"   target="_blank">联系我们</a></dd>

            </dl>

            <dl class="col-links ">
                <dt>关注我们</dt>

                <dd><a rel="nofollow" href="https://weibo.com/xiaomishangcheng"   target="_blank">新浪微博</a></dd>

                <dd><a rel="nofollow" href="http://xiaoqu.qq.com/mobile/share/index.html?url=http%3A%2F%2Fxiaoqu.qq.com%2Fmobile%2Fbarindex.html%3Fwebview%3D1%26type%3D%26source%3Dindex%26_lv%3D25741%26sid%3D%26_wv%3D5123%26_bid%3D128%26%23bid%3D10525%26from%3Dwechat"   target="_blank">小米部落</a></dd>

                <dd><a rel="nofollow" href="#J_modalWeixin" data-toggle="modal" >官方微信</a></dd>

            </dl>

            <dl class="col-links ">
                <dt>特色服务</dt>

                <dd><a rel="nofollow" href="//order.mi.com/queue/f2code"   target="_blank">F 码通道</a></dd>

                <dd><a rel="nofollow" href="//www.mi.com/giftcode/"   target="_blank">礼物码</a></dd>

                <dd><a rel="nofollow" href="//order.mi.com/misc/checkitem"   target="_blank">防伪查询</a></dd>

            </dl>

            <div class="col-contact">
                <p class="phone">400-100-5678</p>
                <p>
                    周一至周日 8:00-18:00<br>（仅收市话费）
                </p>
                <a rel="nofollow" class="btn btn-line-primary btn-small" href="//www.mi.com/service/contact/" target="_blank"><i class="iconfont">&#xe600;</i> 在线客服</a>            </div>
        </div>
    </div>
</div>

<div id="J_modalWeixin" class="modal fade modal-hide modal-weixin" data-width="480" data-height="520">
    <div class="modal-hd">
        <a class="close" data-dismiss="modal"><i class="iconfont">&#xe602;</i></a>
        <span class="title">小米手机官方微信二维码</span>
    </div>
    <div class="modal-bd">
        <img alt="" src="picture/weixin.jpg" width="680" height="340" />
    </div>
</div>
<!-- .modal-weixin END -->
<div class="modal modal-hide modal-bigtap-queue" id="J_bigtapQueue">
    <div class="modal-body">
        <span class="close" data-dismiss="modal" aria-hidden="true">退出排队</span>
        <div class="con">
            <div class="title">正在排队，请稍候喔！</div>
            <div class="queue-tip-box">
                <p class="queue-tip">当前人数较多，请您耐心等待，排队期间请不要关闭页面。</p>
                <p class="queue-tip">时常来官网看看，最新产品和活动信息都会在这里发布。</p>
                <p class="queue-tip">下载小米商城 App 玩玩吧！产品开售信息抢先知道。</p>
                <p class="queue-tip">发现了让你眼前一亮的小米产品，别忘了分享给朋友！</p>
                <p class="queue-tip">产品开售前会有预售信息，关注官网首页就不会错过。</p>
            </div>
        </div>

        <div class="queue-posters">
            <div class="poster poster-3"></div>
            <div class="poster poster-2"></div>
            <div class="poster poster-1"></div>
            <div class="poster poster-4"></div>
            <div class="poster poster-5"></div>
        </div>
    </div>
</div>
<!-- .xm-dm-queue END -->
<div id="J_bigtapError" class="modal modal-hide modal-bigtap-error">
    <span class="close" data-dismiss="modal" aria-hidden="true"><i class="iconfont">&#xe602;</i></span>
    <div class="modal-body">
        <h3>抱歉，网络拥堵无法连接服务器</h3>
        <p  class="error-tip">由于访问人数太多导致服务器压力山大，请您稍后再重试。</p>
        <p >
            <a class="btn btn-primary" id="J_bigtapRetry">重试</a>
        </p>
    </div>
</div>


<div id="J_bigtapModeBox" class="modal fade modal-hide modal-bigtap-mode">
    <span class="close" data-dismiss="modal" ><i class="iconfont">&#xe602;</i></span>
    <div class="modal-body">
        <h3 class="title">为防黄牛，请您输入下面的验证码</h3>
        <p class="desc">在防黄牛的路上，我们一直在努力，也知道做的还不够。<br>
            所以，这次劳烦您多输一次验证码，我们一起防黄牛。</p>
        <div class="mode-loading" id="J_bigtapModeLoading">
            <img src="picture/loading.gif" alt="" width="32" height="32">
            <a  id="J_bigtapModeReload" class="reload  hide" href="javascript:void(0);">网络错误，点击重新获取验证码！</a>
        </div>
        <div class="mode-action hide" id="J_bigtapModeAction">
            <div class="mode-con" id="J_bigtapModeContent"></div>
            <input type="text" name="bigtapmode" class="input-text" id="J_bigtapModeInput" placeholder="请输入正确的验证码">
            <p class="tip" id="J_bigtapModeTip"></p>
            <a class="btn  btn-gray" id="J_bigtapModeSubmit">确认</a>
        </div>
    </div>
</div>
<!-- .xm-dm-error END -->
<div id="J_modal-globalSites" class="modal fade modal-hide modal-globalSites" data-width="640">
    <div class="modal-hd">
        <a class="close" data-dismiss="modal"><i class="iconfont">&#xe602;</i></a>
        <span class="title">Select Region</span>
    </div>
    <div class="modal-bd">
        <h3>Welcome to Mi.com</h3>
        <p class="modal-globalSites-tips">Please select your country or region</p>
        <p class="modal-globalSites-links clearfix">
            <a href="//www.mi.com/index.html">Mainland China</a>
            <a href="http://www.mi.com/hk/">Hong Kong</a>
            <a href="http://www.mi.com/tw/">Taiwan</a>
            <a href="http://www.mi.com/sg/">Singapore</a>
            <a href="http://www.mi.com/my/">Malaysia</a>
            <a href="http://www.mi.com/ph/">Philippines</a>
            <a href="http://www.mi.com/in/">India</a>
            <a href="http://www.mi.com/id/">Indonesia</a>
            <a href="http://www.mi.com/en/">Global Home</a>
            <a href="http://www.mi.com/mena/">MENA</a>
            <a href="http://www.mi.com/pl/">Poland</a>
            <a href="http://www.mi.com/ua/">Ukraine</a>
            <a href="http://www.mi.com/ru/">Russia</a>
            <a href="http://www.mi.com/vn/">Vietnam</a>
            <a href="http://www.mi.com/mx/">Mexico</a>
            <a href="http://www.mi.com/kr/">Korea</a>
            <a href="http://www.mi.com/eg/">Egypt</a>
            <a href="http://www.mi.com/th/">Thailand</a>
            <a href="http://www.mi.com/es/">Spain</a>
            <a href="http://www.mi.com/us/">United States</a>
        </p>
    </div>
</div>
<!-- .modal-globalSites END -->
<script src="js/base.min.js"></script>
<script>
    (function() {
        MI.namespace('GLOBAL_CONFIG');
        MI.GLOBAL_CONFIG = {
            orderSite: '//order.mi.com',
            wwwSite: '//www.mi.com',
            cartSite: '//cart.mi.com',
            itemSite: '//item.mi.com',
            assetsSite: '//s01.mifile.cn',
            listSite: '//list.mi.com',
            searchSite: '//search.mi.com',
            mySite: '//my.mi.com',
            damiaoSite: '//tp.hd.mi.com/',
            damiaoGoodsId: [],
            logoutUrl: '//order.mi.com/site/logout',
            staticSite: '//static.mi.com',
            quickLoginUrl: 'https://account.xiaomi.com/pass/static/login.html'
        };
        MI.setLoginInfo.orderUrl = MI.GLOBAL_CONFIG.orderSite + '/user/order';
        MI.setLoginInfo.logoutUrl = MI.GLOBAL_CONFIG.logoutUrl;
        MI.setLoginInfo.init(MI.GLOBAL_CONFIG);
        MI.miniCart.init();
        MI.updateMiniCart();
    })();
</script>


<script>
    var SITE_ID = "Search";
    var SEARCH_WORDS = "手机";
    var HongBaoHost = "//i.huodong.mi.com";
</script>
<script src="js/goodslist.min.js"></script>
<script>
    var _msq = _msq || [];
    _msq.push(['setDomainId', 100]);
    _msq.push(['trackPageView']);
    (function() {
        var ms = document.createElement('script');
        ms.type = 'text/javascript';
        ms.async = true;
        ms.src = '//s1.mi.com/stat/18/xmst.js';
        var s = document.getElementsByTagName('script')[0];
        s.parentNode.insertBefore(ms, s);
    })();
</script>
<script>
    $(function(){
        $("#btnSubmit").on("click",function(){
            $.get(
                //url
                "${pageContext.request.contextPath}/search",
                //data
                {"keyword":$.trim($("#search").val())},
                //success
                function(data){
                    console.log(data);
                    alert(data);
                }
            );
        });
    });
</script>
</body>
</html>
