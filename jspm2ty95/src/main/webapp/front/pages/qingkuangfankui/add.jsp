<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="true" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
		<title>注册</title>
		<!-- bootstrap样式，地图插件使用 -->
		<link rel="stylesheet" href="../../css/bootstrap.min.css" />
		<link rel="stylesheet" href="../../layui/css/layui.css">
		<!-- 样式 -->
		<link rel="stylesheet" href="../../css/style.css" />
		<!-- 主题（主要颜色设置） -->
		<link rel="stylesheet" href="../../css/theme.css" />
		<!-- 通用的css -->
		<link rel="stylesheet" href="../../css/common.css" />
	</head>
	<style>
		html::after {
			position: fixed;
			top: 0;
			right: 0;
			left: 0;
			bottom: 0;
			content: '';
			display: block;
			background-attachment: fixed;
			background-size: cover;
			background-position: center;
			z-index: -1;
		}
		#swiper {
			overflow: hidden;
			margin: 0 auto;
		}
		#swiper .layui-carousel-ind li {
			width: 15px;
			height: 15px;
			border-width: 0;
			border-style: solid;
			border-color: rgba(0,0,0,.3);
			border-radius: 100px;
			background-color: rgba(255, 255, 255, 1);
			box-shadow: 0 0 0px rgba(110,22,64,.8);
		}
		#swiper .layui-carousel-ind li.layui-this {
			width: 15px;
			height: 15px;
			border-width: 0;
			border-style: solid;
			border-color: rgba(0,0,0,.3);
			border-radius: 100px;
			background-color: rgba(0, 0, 0, 1);
			box-shadow: 0 0 0px rgba(110,22,64,.8);
		}
		
		button, button:focus {
			outline: none;
		}
		
		.data-add-container .add .layui-select-title .layui-unselect {
			padding: 0 12px;
			height: 40px;
			font-size: 14px;
			color: #333;
			border-radius: 4px;
			border-width: 2px;
			border-style: solid;
			border-color: rgba(132, 117, 78, 1);
			background-color: #fff;
			box-shadow: 0 0 6px rgba(132, 117, 78,.8);
			text-align: left;
		}
		.data-add-container .add .layui-form-item {
			display: flex;
			align-items: center;
			justify-content: center;
		}
		.data-add-container .layui-form-pane .layui-form-item[pane] .layui-form-label {
			margin: 0;
			position: inherit;
			background: transparent;
			border: 0;
		}
		.data-add-container .add .layui-input-block {
			margin: 0;
			flex: 1;
		}
		.data-add-container .layui-form-pane .layui-form-item[pane] .layui-input-inline {
			margin: 0;
			flex: 1;
			display: flex;
		}
	</style>
	<body>


		<div id="app">
		
			<!-- 轮播图 -->
			<!-- <div class="layui-carousel" id="swiper">
				<div carousel-item id="swiper-item">
					<div v-for="(item,index) in swiperList" v-bind:key="index">
						<img class="swiper-item" :src="item.img">
					</div>
				</div>
			</div> -->
			<div class="layui-carousel" id="swiper" :style='{"boxShadow":"0 0 0px rgba(110,22,64,0.8)","margin":"0 auto","borderColor":"rgba(0, 0, 0, 1)","borderRadius":"0px","borderWidth":"0px","width":"91%","borderStyle":"solid"}'>
			  <div carousel-item id="swiper-item">
				<div v-for="(item,index) in swiperList" :key="index">
					<img style="width: 100%;height: 100%;object-fit:cover;" :src="item.img" />
				</div>
			  </div>
			</div>
			<!-- 轮播图 -->
		
			<div class="data-add-container">
		
				<form class="layui-form layui-form-pane" lay-filter="myForm">
					
		            <div class="layui-form-item" pane>
						<label class="layui-form-label">标题：</label>
						<div class="layui-input-block">
							<input v-model="detail.biaoti" type="text" :readonly="ro.biaoti" name="biaoti" id="biaoti" autocomplete="off" class="layui-input">
						</div>
					</div>
		            <div class="layui-form-item" pane>
		                <label class="layui-form-label">工号</label>
		                <div class="layui-input-block">
		                    <select name="gonghao" id="gonghao" lay-filter="gonghao"  >
		                        <option value="">请选择</option>
		                        <option v-for="(item,index) in gonghao" v-bind:key="index" :value="item">{{item}}</option>
		                    </select>
		                </div>
		            </div>
		            <div class="layui-form-item" pane>
						<label class="layui-form-label">教师姓名：</label>
						<div class="layui-input-block">
							<input v-model="detail.jiaoshixingming" type="text" :readonly="ro.jiaoshixingming" name="jiaoshixingming" id="jiaoshixingming" autocomplete="off" class="layui-input">
						</div>
					</div>
		            <div class="layui-form-item" pane>
						<label class="layui-form-label">电话：</label>
						<div class="layui-input-block">
							<input v-model="detail.dianhua" type="text" :readonly="ro.dianhua" name="dianhua" id="dianhua" autocomplete="off" class="layui-input">
						</div>
					</div>
		            <div class="layui-form-item" pane>
						<label class="layui-form-label">反馈时间：</label>
						<div class="layui-input-block">
							<input type="text" name="fankuishijian" id="fankuishijian" autocomplete="off" class="layui-input" >
						</div>
					</div>
		            
		            <div class="layui-form-item" pane>
						<label class="layui-form-label">反馈内容：</label>
						<div class="layui-input-block">
							<textarea name="fankuineirong" id="fankuineirong">请输入反馈内容</textarea>
						</div>
					</div>
		
					<div class="layui-form-item">
						<div class="layui-input-block" style="text-align: right;margin-right: 30px;">
							<button class="layui-btn btn-submit" lay-submit lay-filter="*">提交</button>
							<button type="reset" class="layui-btn layui-btn-primary">重置</button>
						</div>
					</div>
				</form>
			</div>
		</div>

		<script src="../../layui/layui.js"></script>
		<script src="../../js/vue.js"></script>
		<!-- 组件配置信息 -->
		<script src="../../js/config.js"></script>
		<!-- 扩展插件配置信息 -->
		<script src="../../modules/config.js"></script>
		<!-- 工具方法 -->
		<script src="../../js/utils.js"></script>
		<!-- 校验格式工具类 -->
		<script src="../../js/validate.js"></script>
		<!-- 地图 -->
		<script type="text/javascript" src="../../js/jquery.js"></script>
		<script type="text/javascript" src="http://webapi.amap.com/maps?v=1.3&key=ca04cee7ac952691aa67a131e6f0cee0"></script>
		<script type="text/javascript" src="../../js/bootstrap.min.js"></script>
		<script type="text/javascript" src="../../js/bootstrap.AMapPositionPicker.js"></script>

		<script>
			var jquery = $;
			
			var vue = new Vue({
				el: '#app',
				data: {
					// 轮播图
					swiperList: [{
						img: '../../img/banner.jpg'
					}],
					baseurl: '',
					dataList: [],
					ro:{
                                        biaoti : false,
                                        gonghao : false,
                                        jiaoshixingming : false,
                                        dianhua : false,
                                        fankuineirong : false,
                                        fankuishijian : false,
					},
                    detail: {
                        biaoti: '',
                        gonghao: '',
                        jiaoshixingming: '',
                        dianhua: '',
                        fankuineirong: '',
                        fankuishijian: '',
                    },
					gonghao: [],
					centerMenu: centerMenu
				},
				updated: function() {
					layui.form.render('select', 'myForm');
				},
                computed: {
                },
				methods: {
					jump(url) {
						jump(url)
					}
				}
			})


			layui.use(['layer', 'element', 'carousel', 'http', 'jquery', 'form', 'upload', 'laydate','tinymce'], function() {
				var layer = layui.layer;
				var element = layui.element;
				var carousel = layui.carousel;
				var http = layui.http;
				var jquery = layui.jquery;
				var form = layui.form;
				var upload = layui.upload;
				var laydate = layui.laydate;
				var tinymce = layui.tinymce;
				vue.baseurl = http.baseurl;

				// 获取轮播图 数据
				http.request('config/list', 'get', {
					page: 1,
					limit: 5
				}, function(res) {
					if (res.data.list.length > 0) {
						var swiperItemHtml = '';
						for (let item of res.data.list) {
							if (item.name.indexOf('picture') >= 0 && item.value && item.value != "" && item.value != null) {
								swiperItemHtml +=
									'<div>' +
									'<img style="width: 100%;height: 100%;object-fit:cover;" class="swiper-item" src="' + http.baseurl+item.value + '">' +
									'</div>';
							}
						}
						jquery('#swiper-item').html(swiperItemHtml);
						// 轮播图
						vue.$nextTick(() => {
						  carousel.render({
						  	elem: '#swiper',
							width: '91%',
						  	height: '460px',
						  	arrow: 'hover',
						  	anim: 'default',
						  	autoplay: 'true',
						  	interval: '3000',
						  	indicator: 'inside'
						  });
						
						})
					}
				});

				http.request(`option/jiaoshi/gonghao`,'get',{},(res)=>{
					vue.gonghao = res.data
				});
				form.on('select(gonghao)', (data) => {
					console.log(data.value);
					http.request('follow/jiaoshi/gonghao', 'get', {
						columnValue: data.value
					}, function(res) {
						vue.detail.gonghao=res.data.gonghao
						vue.detail.jiaoshixingming=res.data.jiaoshixingming
						vue.detail.dianhua=res.data.dianhua
					})
				});
                var edit = tinymce.render({
                    elem: "#fankuineirong",
                    height: 600,
                    images_upload_handler: function(blobInfo, succFun, failFun) {
                        var xhr, formData;
                        var file = blobInfo.blob(); //转化为易于理解的file对象
                        xhr = new XMLHttpRequest();
                        xhr.withCredentials = false;
                        xhr.open('POST', http.baseurl + 'file/upload');
                        xhr.setRequestHeader("Token", localStorage.getItem('Token')); //设置请求头
                        xhr.onload = function() {
                            var json;
                            if (xhr.status != 200) {
                                failFun('HTTP Error: ' + xhr.status);
                                return;
                            }
                            json = JSON.parse(xhr.responseText);
                            if (!json || typeof json.file != 'string') {
                                failFun('Invalid JSON: ' + xhr.responseText);
                                return;
                            }
                            succFun(http.baseurl + '/upload/' + json.file);
                        };
                        formData = new FormData();
                        formData.append('file', file, file.name); //此处与源文档不一样
                        xhr.send(formData);
                    }
                }, (opt) => {

                });
                                jquery('#fankuishijian').val(getCurDateTime());
				laydate.render({
					elem: '#fankuishijian',
					type: 'datetime'
				});
				
                // session独取
				let table = localStorage.getItem("userTable");
				http.request(`${table}/session`, 'get', {}, function(data) {
					// 表单赋值
					//form.val("myForm", data.data);
					data = data.data
					for(var key in data){
					}
				});

                // 跨表计算
                if(http.getParam('corss')){
					var obj = JSON.parse(localStorage.getItem('crossObj'));
					//form.val("myForm", obj);
					for(var o in obj){
                                        if(o=='biaoti'){
                                                vue.detail[o] = obj[o];
                                                vue.ro.biaoti = true;
                                                continue;
                                        }
                                        if(o=='gonghao'){
                                                vue.detail[o] = obj[o];
                                                vue.ro.gonghao = true;
                                                continue;
                                        }
                                        if(o=='jiaoshixingming'){
                                                vue.detail[o] = obj[o];
                                                vue.ro.jiaoshixingming = true;
                                                continue;
                                        }
                                        if(o=='dianhua'){
                                                vue.detail[o] = obj[o];
                                                vue.ro.dianhua = true;
                                                continue;
                                        }
                                        if(o=='fankuineirong'){
                                                vue.detail[o] = obj[o];
                                                vue.ro.fankuineirong = true;
                                                continue;
                                        }
                                        if(o=='fankuishijian'){
                                                vue.detail[o] = obj[o];
                                                vue.ro.fankuishijian = true;
                                                jquery('#fankuishijian').val(obj[o]);
                                                continue;
                                        }
					}
				}
				

				// 提交
				form.on('submit(*)', function(data) {
					data = data.field;
					
                    // 数据校验
                    if(!data.biaoti){
                        layer.msg('标题不能为空', {
							time: 2000,
							icon: 5
						});
                        return false
                    }
					var fankuineirong = tinymce.get('#fankuineirong').getContent()
					data.fankuineirong = fankuineirong;

					// 跨表计算判断
					
                    // 比较大小

                //更新跨表属性
               var crossuserid;
               var crossrefid;
               var crossoptnum;
                if(http.getParam('corss')){
                        var statusColumnName = localStorage.getItem('statusColumnName');
                        var statusColumnValue = localStorage.getItem('statusColumnValue');
                        if(statusColumnName!='') {
                                var obj = JSON.parse(localStorage.getItem('crossObj'));
				if(!statusColumnName.startsWith("[")) {
					for (var o in obj){
						if(o==statusColumnName){
							obj[o] = statusColumnValue;
						}
					}
					var table = localStorage.getItem('crossTable');
					http.requestJson(`${table}/update`,'post',obj,(res)=>{});
				} else {
                                       crossuserid=Number(localStorage.getItem('userid'));
                                       crossrefid=obj['id'];
                                       crossoptnum=localStorage.getItem('statusColumnName');
                                       crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
				}
                        }
                }
                        if(crossrefid && crossuserid) {
                                data.crossuserid=crossuserid;
                                data.crossrefid=crossrefid;
                                http.request('qingkuangfankui/list', 'get', {
                                        page: 1,
                                        limit: 10,
                                        crossuserid:crossuserid,
                                        crossrefid:crossrefid,
                                }, function(res) {
                                        if(res.data.total>=crossoptnum) {
                                                layer.msg(localStorage.getItem('tips'), {
                                                        time: 2000,
                                                        icon: 6
                                                })
                                             return false;
                                        } else {
                                            // 跨表计算
                                            // 提交数据
                                            http.requestJson('qingkuangfankui' + '/add', 'post', data, function(res) {
                                                    layer.msg('提交成功', {
                                                            time: 2000,
                                                            icon: 6
                                                    }, function() {
                                                            back();
                                                    });
                                             });
                                        }
                                });
                        } else {
                                // 跨表计算
                                // 提交数据
                                http.requestJson('qingkuangfankui' + '/add', 'post', data, function(res) {
                                        layer.msg('提交成功', {
                                                time: 2000,
                                                icon: 6
                                        }, function() {
                                                back();
                                        });
                                 });
                        }
			return false
			});
		});
		</script>
	</body>
</html>
