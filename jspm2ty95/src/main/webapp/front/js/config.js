
var projectName = '校园心理健康网站的设计与实现';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.jsp'
}, 
{
	name: '我的收藏',
	url: '../storeup/list.jsp'
}
]


var indexNav = [

{
	name: '知识文章',
	url: './pages/zhishiwenzhang/list.jsp'
}, 
{
	name: '问卷调查',
	url: './pages/wenjuandiaocha/list.jsp'
}, 

{
	name: '公告信息',
	url: './pages/news/list.jsp'
},
]

var adminurl =  "http://localhost:8080/jspm2ty95/index.jsp";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-form","buttons":["查看","修改","删除"],"menu":"学生","menuJump":"列表","tableName":"xuesheng"}],"menu":"学生管理"},{"child":[{"appFrontIcon":"cuIcon-copy","buttons":["查看","修改","删除"],"menu":"教师","menuJump":"列表","tableName":"jiaoshi"}],"menu":"教师管理"},{"child":[{"appFrontIcon":"cuIcon-addressbook","buttons":["新增","查看","修改","删除"],"menu":"文章类型","menuJump":"列表","tableName":"wenzhangleixing"}],"menu":"文章类型管理"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除","查看评论"],"menu":"知识文章","menuJump":"列表","tableName":"zhishiwenzhang"}],"menu":"知识文章管理"},{"child":[{"appFrontIcon":"cuIcon-vipcard","buttons":["新增","查看","修改","删除"],"menu":"问卷调查","menuJump":"列表","tableName":"wenjuandiaocha"}],"menu":"问卷调查管理"},{"child":[{"appFrontIcon":"cuIcon-pic","buttons":["查看","修改","删除","结果"],"menu":"问卷答卷","menuJump":"列表","tableName":"wenjuandajuan"}],"menu":"问卷答卷管理"},{"child":[{"appFrontIcon":"cuIcon-similar","buttons":["查看","修改","删除"],"menu":"分析结果","menuJump":"列表","tableName":"fenxijieguo"}],"menu":"分析结果管理"},{"child":[{"appFrontIcon":"cuIcon-attentionfavor","buttons":["新增","查看","修改","删除"],"menu":"情况反馈","menuJump":"列表","tableName":"qingkuangfankui"}],"menu":"情况反馈管理"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"公告信息","tableName":"news"},{"appFrontIcon":"cuIcon-news","buttons":["查看","修改"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-goodsnew","buttons":["查看"],"menu":"知识文章列表","menuJump":"列表","tableName":"zhishiwenzhang"}],"menu":"知识文章模块"},{"child":[{"appFrontIcon":"cuIcon-album","buttons":["查看","答卷"],"menu":"问卷调查列表","menuJump":"列表","tableName":"wenjuandiaocha"}],"menu":"问卷调查模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-pic","buttons":["查看","删除"],"menu":"问卷答卷","menuJump":"列表","tableName":"wenjuandajuan"}],"menu":"问卷答卷管理"},{"child":[{"appFrontIcon":"cuIcon-similar","buttons":["查看"],"menu":"分析结果","menuJump":"列表","tableName":"fenxijieguo"}],"menu":"分析结果管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-goodsnew","buttons":["查看"],"menu":"知识文章列表","menuJump":"列表","tableName":"zhishiwenzhang"}],"menu":"知识文章模块"},{"child":[{"appFrontIcon":"cuIcon-album","buttons":["查看","答卷"],"menu":"问卷调查列表","menuJump":"列表","tableName":"wenjuandiaocha"}],"menu":"问卷调查模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"学生","tableName":"xuesheng"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-similar","buttons":["查看"],"menu":"分析结果","menuJump":"列表","tableName":"fenxijieguo"}],"menu":"分析结果管理"},{"child":[{"appFrontIcon":"cuIcon-attentionfavor","buttons":["查看"],"menu":"情况反馈","menuJump":"列表","tableName":"qingkuangfankui"}],"menu":"情况反馈管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-goodsnew","buttons":["查看"],"menu":"知识文章列表","menuJump":"列表","tableName":"zhishiwenzhang"}],"menu":"知识文章模块"},{"child":[{"appFrontIcon":"cuIcon-album","buttons":["查看","答卷"],"menu":"问卷调查列表","menuJump":"列表","tableName":"wenjuandiaocha"}],"menu":"问卷调查模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"是","roleName":"教师","tableName":"jiaoshi"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
