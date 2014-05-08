<!DOCTYPE html>
<html lang="ko">
  <head>
    <meta charset="utf-8">
    <title>FlowDabbler</title>
    <meta name="description" content="FlowDabbler"/>

    <meta name="viewport" content="width=1000, initial-scale=1.0, maximum-scale=1.0">

    <!-- Loading Bootstrap -->
    <link href="/resources/bootstrap/css/bootstrap.css" rel="stylesheet">

    <!-- Loading Flat UI -->
    <link href="/resources/css/flowdabbler-ui.css" rel="stylesheet">
    <link href="/resources/css/demo.css" rel="stylesheet">

    <link rel="shortcut icon" href="/resources/images/favicon.ico">
  </head>
  <body>
    <div class="container">

		<div class="login">
	        <div class="login-screen">
	          <div class="login-icon">
	            <img src="/resources/images/icons/svg/paper-bag.svg" alt="Welcome to FlowDabbler Area" />
	            <h4>Welcome to <small>FlowDabbler</small></h4>
	          </div>
	
	          <div class="login-form">
	            <div class="form-group">
	              <input type="text" class="form-control login-field" value="" placeholder="Enter your name" id="login-name" />
	              <label class="login-field-icon fui-user" for="login-name"></label>
	            </div>
	
	            <div class="form-group">
	              <input type="password" class="form-control login-field" value="" placeholder="Password" id="login-pass" />
	              <label class="login-field-icon fui-lock" for="login-pass"></label>
	            </div>
	
	            <a class="btn btn-primary btn-lg btn-block" href="javascript:login()">Log in</a>
	            <a class="login-link">Lost your password?</a>
	          </div>
	        </div>
	      </div>

    </div> <!-- /container -->

    <!-- Load JS here for greater good =============================-->
    <script src="/resources/js/jquery-1.8.3.min.js"></script>
    <script src="/resources/js/jquery-ui-1.10.3.custom.min.js"></script>
    <script src="/resources/js/jquery.ui.touch-punch.min.js"></script>
    <script src="/resources/js/bootstrap.min.js"></script>
    <script src="/resources/js/bootstrap-select.js"></script>
    <script src="/resources/js/bootstrap-switch.js"></script>
    <script src="/resources/js/flatui-checkbox.js"></script>
    <script src="/resources/js/flatui-radio.js"></script>
    <script src="/resources/js/jquery.tagsinput.js"></script>
    <script src="/resources/js/jquery.placeholder.js"></script>
    <script src="/resources/js/jquery.stacktable.js"></script>
    <script src="/resources/http://vjs.zencdn.net/4.3/video.js"></script>
    <script src="/resources/js/application.js"></script>
    <script type="text/javascript">
    	function login() {
    		alert("Login Test");
    	}
    </script>
  </body>
</html>
