<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="true" %>
<!-- 登陆 -->
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
		<title>登录</title>
		<link rel="stylesheet" href="../../layui/css/layui.css">
		<!-- 样式 -->
		<link rel="stylesheet" href="../../css/style.css" />
		<!-- 主题（主要颜色设置） -->
		<link rel="stylesheet" href="../../css/theme.css" />
		<!-- 通用的css -->
		<link rel="stylesheet" href="../../css/common.css" />
			</head>
	<style type="text/css">
		html, body {
			height: 100%;
		}
		.login {
			display: flex;
			justify-content: center;
			align-items: center;
		    width: 100%;
		    height: 100%;
			background-attachment: fixed;
			background-size: cover;
			background-position: center;
									background-image: url(http://codegen.caihongy.cn/20201210/7e1346770866496d8a0ad3b8aa03d3f5.jpg);
								}
		.login form {
			box-sizing: border-box;
			min-height: 400px;
			display: flex;
			flex-direction: column;
			justify-content: center;
			position: inherit;
		}
		.login .logo, .login .title {
			box-sizing: border-box;
		}
		.login .logo img {
			display: block;
		}
		.login .title {
			text-align: center;
		}
		.login .form-item {
			display: flex;
			align-items: center;
			flex-wrap: wrap;
			box-sizing: border-box;
		}
		.login .form-item input, .login .form-label {
			box-sizing: border-box;
		}
		.login .btn-submit {
			display: block;
			box-sizing: border-box;
            height: 30px !important;
		}
        .login .layui-btn-primary {
            height: 30px !important;
        }
		.login form p.txt {
			width: 100%;
			margin: 0;
			box-sizing: border-box;
		}
		.l-redio .layui-form-radio {
			margin: 0;
		}
		.l-redio .layui-form-radio>i {
			font-size: 14px;
			color: #DCDFE6;
		}
		.l-redio .layui-form-radio>div {
			font-size: 14px;
			color: rgba(1, 2, 5, 1);
		}
		.l-redio .layui-form-radioed>i {
			font-size: 14px;
			color: rgba(15, 2, 8, 1);
		}
		.l-redio .layui-form-radioed>div {
			font-size: 14px;
			color: rgba(0, 0, 0, 1);
		}
		
		#loginForm .codes {
					}
			
			#loginForm .codes input {
				width: calc(100% - 84px);
				height: 44px;
				margin: 0;
				color: rgb(110, 22, 64);
				font-size: 14px;
				padding: 0 10px;
				border-radius: 0;
				border-width: 1px;
				border-style: solid;
				border-color: rgb(110, 22, 64);
				background-color: #fff;
				box-shadow: 0 0 6px rgba(30, 144, 255, 0);
				outline: none;
			}
			
			#loginForm .codes .nums {
				width: 84px;
				height: 44px;
				margin: 0;
				color: $template2.front.login.code.nums.color;
				font-size: $template2.front.login.code.nums.fontSize;
				padding: 0;
				border-radius: 0;
				border-width: 1px 1px 1px 0;
				border-style: solid;
				border-color: rgb(110, 22, 64);
				background-color: #f5f5f5;
				box-shadow: 0 0 6px rgba(30, 144, 255, 0);
				outline: none;
				box-sizing: border-box;
			}
	</style>
	<body>
				<div id="app" class="login" style="position:relative" >
			<form id="loginForm" class="layui-form login-form" :style='{"padding":"0","boxShadow":"0 0 6px rgba(230,230,230, 8)","borderColor":"rgba(230, 230, 230, 1)","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"12px","borderWidth":"0px ","width":"870px","borderStyle":"solid","justifyContent":"center","height":"400px"}'>
				<div class="logo" v-if="false" :style='{"padding":"0 10px","boxShadow":"0 0 6px rgba(110,22,64,.8)","margin":"10px auto 0","borderColor":"rgba(0,0,0,1)","backgroundColor":"#f7f7f7","color":"rgba(110,22,64,1)","isshow":false,"borderRadius":"8px","borderWidth":"0","width":"auto","lineHeight":"32px","fontSize":"12px","borderStyle":"solid"}'>USER / LOGIN</div>
				<div class="msg-warn hide title" v-if="true" :style='{"padding":"0px","boxShadow":"0 0 0px rgba(206, 25, 25, 2)","margin":"-90px 0px -350px 410px","borderColor":"rgba(24, 2, 2, 1)","backgroundColor":"rgba(206, 25, 25, 1)","color":"rgba(255, 255, 255, 1)","isshow":true,"borderRadius":"18px","borderWidth":"0px","width":"430px","lineHeight":"470px","fontSize":"20px","borderStyle":"solid"}'>校园心理健康网站的设计与实现</div>
				
				<div :style='{"padding":"10px ","boxShadow":"0 0 6px rgba(255,0,0,0)","margin":"0px 0px 0px 42px","borderColor":"rgba(0,0,0,1)","backgroundColor":"rgba(255, 250, 250, 0)","borderRadius":"0","borderWidth":"0","width":"300px","borderStyle":"solid","height":"55px"}' class="form-item">
				    <label v-if="true" :style='{"padding":"10px","boxShadow":"0 0 6px rgba(255,0,0,0)","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(255, 255, 255, 0)","color":"#333","borderRadius":"0","textAlign":"center","borderWidth":"0","width":"65px","fontSize":"15px","borderStyle":"solid"}' class="form-label">账号</label>
					<input :style='{"padding":"0px","boxShadow":"0 0 0px rgba(41,42,45, 1)","borderColor":"rgba(132, 117, 78, 1)","backgroundColor":"rgba(255, 255, 255, 1)","color":"#333","borderRadius":"8px","textAlign":"center","borderWidth":"1px","width":"200px","fontSize":"15px","borderStyle":"solid","height":"38px"}' type="text" name="username" required lay-verify="required" placeholder="请输入账号" autocomplete="off" class="layui-input">
				</div>
				<div :style='{"padding":"10px ","boxShadow":"0 0 6px rgba(255,0,0,0)","margin":"0px 0px 0px 42px","borderColor":"rgba(0,0,0,1)","backgroundColor":"rgba(255, 250, 250, 0)","borderRadius":"0","borderWidth":"0","width":"300px","borderStyle":"solid","height":"55px"}' class="form-item">
				    <label v-if="true" :style='{"padding":"10px","boxShadow":"0 0 6px rgba(255,0,0,0)","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(255, 255, 255, 0)","color":"#333","borderRadius":"0","textAlign":"center","borderWidth":"0","width":"65px","fontSize":"15px","borderStyle":"solid"}' class="form-label">密码</label>
					<input :style='{"padding":"0px","boxShadow":"0 0 0px rgba(41,42,45, 1)","borderColor":"rgba(132, 117, 78, 1)","backgroundColor":"rgba(255, 255, 255, 1)","color":"#333","borderRadius":"8px","textAlign":"center","borderWidth":"1px","width":"200px","fontSize":"15px","borderStyle":"solid","height":"38px"}' type="password" name="password" required lay-verify="required" placeholder="请输入密码" autocomplete="off" class="layui-input">
				</div>
				<div :style='{"padding":"0px","boxShadow":"0 0 0px rgba(255,0,0,0)","margin":"10px 0px  0px 35px","borderColor":"rgba(132, 117, 78, 1)","backgroundColor":"rgba(255, 255, 255, 0)","borderRadius":"0","borderWidth":"0 0 1px 0","width":"310px","borderStyle":"solid","height":"44px"}' class="form-item l-redio">
					<input v-if="item.tableName!='users'&&item.hasFrontLogin=='是'" v-for="(item,index) in menu" v-bind:key="index" type="radio" name="role" id="role" :value="item.tableName" :title="item.roleName">
				</div>

				<div style="display:flex;flex-wrap:wrap;">
					<button :style='{"padding":"0px","boxShadow":"0 0 0px rgba(255, 0, 0, 0)","margin":"17px 10px 0px 45px","borderColor":"rgba(5, 0, 0, 1)","backgroundColor":"rgba(132, 117, 78, 1)","color":"rgba(0, 0, 0, 1)","borderRadius":"8px","borderWidth":"0px","width":"80px","fontSize":"15px","lineHeight":"30px","borderStyle":"solid","height":"44px"}' class="layui-btn btn-submit" lay-submit lay-filter="login">登录</button>
					<button :style='{"padding":"0px","boxShadow":"0 0 0px rgba(110,22,64,.5)","margin":"17px 0px 25px 110px ","borderColor":"rgba(0, 0, 0, 1)","backgroundColor":"rgba(132, 117, 78, 1)","color":"rgba(0, 0, 0, 1)","borderRadius":"8px","borderWidth":"0px","width":"80px","fontSize":"15px","lineHeight":"30px","borderStyle":"solid","height":"44px"}' type="reset" class="layui-btn layui-btn-primary">重置</button>
				</div>
				<p :style='{"color":"rgba(0, 0, 0, 1)","textAlign":"left","fontSize":"12px"}' class="txt"><a style="color: inherit;font-size: inherit;margin-right:8px" v-if="item.tableName!='users'&&item.hasFrontRegister=='是'" v-for="(item,index) in menu" v-bind:key="index" :href="'javascript:registerClick(\''+item.tableName+'\')'">注册{{item.roleName.replace('注册','')}}</a></p>
			</form>
		</div>

		<script src="../../layui/layui.js"></script>
		<script src="../../js/vue.js"></script>
		<!-- 组件配置信息 -->
		<script src="../../js/config.js"></script>
		<!-- 扩展插件配置信息 -->
		<script src="../../modules/config.js"></script>
		<!-- 工具方法 -->
		<script src="../../js/utils.js"></script>
				<script>
			var vue = new Vue({
				el: '#app',
				data: {
					menu: menu
				},
				methods: {
					jump(url) {
						jump(url)
					}
				}
			})
			
			var codes = [{
					num: 1,
					color: '#000',
					rotate: '10deg',
					size: '16px'
				  }, {
					num: 2,
					color: '#000',
					rotate: '10deg',
					size: '16px'
				  }, {
					num: 3,
					color: '#000',
					rotate: '10deg',
					size: '16px'
				  }, {
					num: 4,
					color: '#000',
					rotate: '10deg',
					size: '16px'
				  }]

			layui.use(['layer', 'element', 'carousel', 'form', 'http', 'jquery'], function() {
				var layer = layui.layer;
				var element = layui.element;
				var carousel = layui.carousel;
				var form = layui.form;
				var http = layui.http;
				var jquery = layui.jquery;
				
				function randomString() {
					var len = 4;
					var chars = [
					  'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
					  'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
					  'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G',
					  'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
					  'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2',
					  '3', '4', '5', '6', '7', '8', '9'
					]
					var colors = ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f']
					var sizes = ['14', '15', '16', '17', '18']
					
					var output = []
					for (var i = 0; i < len; i++) {
					  // 随机验证码
					  var key = Math.floor(Math.random() * chars.length)
					  codes[i].num = chars[key]
					  // 随机验证码颜色
					  var code = '#'
					  for (var j = 0; j < 6; j++) {
					    var key = Math.floor(Math.random() * colors.length)
					    code += colors[key]
					  }
					  codes[i].color = code
					  // 随机验证码方向
					  var rotate = Math.floor(Math.random() * 45)
					  var plus = Math.floor(Math.random() * 2)
					  if (plus == 1) rotate = '-' + rotate
					  codes[i].rotate = 'rotate(' + rotate + 'deg)'
					  // 随机验证码字体大小
					  var size = Math.floor(Math.random() * sizes.length)
					  codes[i].size = sizes[size] + 'px'
					}
					
					var str = ''
					for(var i = 0;i<codes.length;i++) {
						str += '<span style="color:' + codes[i].color + ';transform:' + codes[i].rotate + ';fontSize:' + codes[i].size + ';padding: 0 3px;display:inline-block">'+codes[i].num+'</span>'
					}
					jquery('#nums').html('').append(str);
				}
				
				jquery('#nums').click(function(){
					randomString();
				})
				
				randomString();

				// 登录
				form.on('submit(login)', function(data) {
					data = data.field;
					if (!data.role) {
						layer.msg('请选择登录用户类型', {
							time: 2000,
							icon: 5
						});
						return false;
					}
					
					http.request(data.role + '/login', 'get', data, function(res) {
						layer.msg('登录成功', {
							time: 2000,
							icon: 6
						});
						// 登录凭证
						localStorage.setItem('Token', res.token);
						localStorage.setItem('role', jquery('#role:checked').attr('title'));
						// 当前登录用户角色
						localStorage.setItem('userTable', data.role);
						localStorage.setItem('sessionTable', data.role);
						// 用户名称
						localStorage.setItem('adminName', data.username);
						http.request(data.role + '/session', 'get', {}, function(res) {
							// 用户id
							localStorage.setItem('userid', res.data.id);
							if(res.data.vip) {
								localStorage.setItem('vip', res.data.vip);
							}
							// 路径访问设置
							window.location.href = '../../index.jsp';
						})
						
					});
					return false
				});

			});

			/**
			 * 跳转登录
			 * @param {Object} tablename
			 */
			function registerClick(tablename) {
				window.location.href = '../' + tablename + '/register.jsp?tablename=' + tablename;
			}
		</script>
	</body>
</html>
