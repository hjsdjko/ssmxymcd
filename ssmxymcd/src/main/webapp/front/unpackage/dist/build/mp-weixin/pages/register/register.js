(global["webpackJsonp"]=global["webpackJsonp"]||[]).push([["pages/register/register"],{"1c00":function(e,n,t){},"4a4d":function(e,n,t){"use strict";t.r(n);var u=t("e308"),a=t.n(u);for(var r in u)"default"!==r&&function(e){t.d(n,e,(function(){return u[e]}))}(r);n["default"]=a.a},"4c4e":function(e,n,t){"use strict";var u=t("1c00"),a=t.n(u);a.a},be4a:function(e,n,t){"use strict";var u;t.d(n,"b",(function(){return a})),t.d(n,"c",(function(){return r})),t.d(n,"a",(function(){return u}));var a=function(){var e=this,n=e.$createElement;e._self._c},r=[]},ca97:function(e,n,t){"use strict";(function(e){t("6a7c");u(t("66fd"));var n=u(t("e7f1"));function u(e){return e&&e.__esModule?e:{default:e}}e(n.default)}).call(this,t("543d")["createPage"])},e308:function(e,n,t){"use strict";(function(e){Object.defineProperty(n,"__esModule",{value:!0}),n.default=void 0;var u=a(t("a34a"));function a(e){return e&&e.__esModule?e:{default:e}}function r(e,n,t,u,a,r,i){try{var o=e[r](i),s=o.value}catch(g){return void t(g)}o.done?n(s):Promise.resolve(s).then(u,a)}function i(e){return function(){var n=this,t=arguments;return new Promise((function(u,a){var i=e.apply(n,t);function o(e){r(i,u,a,o,s,"next",e)}function s(e){r(i,u,a,o,s,"throw",e)}o(void 0)}))}}var o={data:function(){return{gongyuguanliyuanxingbieOptions:[],gongyuguanliyuanxingbieIndex:0,xueshengloucenghaoOptions:[],xueshengloucenghaoIndex:0,xueshengxingbieOptions:[],xueshengxingbieIndex:0,ruleForm:{},tableName:""}},onLoad:function(){var n=this;return i(u.default.mark((function t(){var a,r;return u.default.wrap((function(t){while(1)switch(t.prev=t.next){case 0:if(a=[],r=e.getStorageSync("loginTable"),n.tableName=r,"gongyuguanliyuan"==n.tableName&&(n.gongyuguanliyuanxingbieOptions="男,女".split(","),n.ruleForm.xingbie=n.gongyuguanliyuanxingbieOptions[0]),"xuesheng"!=n.tableName){t.next=10;break}return t.next=7,n.$api.option("loucengxinxi","louceng",{});case 7:a=t.sent,n.xueshengloucenghaoOptions=a.data,n.ruleForm.loucenghao=n.xueshengloucenghaoOptions[0];case 10:"xuesheng"==n.tableName&&(n.xueshengxingbieOptions="男,女".split(","),n.ruleForm.xingbie=n.xueshengxingbieOptions[0]),n.styleChange();case 12:case"end":return t.stop()}}),t)})))()},methods:{gongyuguanliyuanxingbieChange:function(e){this.gongyuguanliyuanxingbieIndex=e.target.value,this.ruleForm.xingbie=this.gongyuguanliyuanxingbieOptions[this.gongyuguanliyuanxingbieIndex]},xueshengloucenghaoChange:function(e){this.xueshengloucenghaoIndex=e.target.value,this.ruleForm.loucenghao=this.xueshengloucenghaoOptions[this.xueshengloucenghaoIndex]},xueshengxingbieChange:function(e){this.xueshengxingbieIndex=e.target.value,this.ruleForm.xingbie=this.xueshengxingbieOptions[this.xueshengxingbieIndex]},styleChange:function(){this.$nextTick((function(){}))},getUUID:function(){return(new Date).getTime()},register:function(){var e=this;return i(u.default.mark((function n(){return u.default.wrap((function(n){while(1)switch(n.prev=n.next){case 0:if(e.ruleForm.zhanghao||"gongyuguanliyuan"!=e.tableName){n.next=3;break}return e.$utils.msg("账号不能为空"),n.abrupt("return");case 3:if(e.ruleForm.mima||"gongyuguanliyuan"!=e.tableName){n.next=6;break}return e.$utils.msg("密码不能为空"),n.abrupt("return");case 6:if(e.ruleForm.xingming||"gongyuguanliyuan"!=e.tableName){n.next=9;break}return e.$utils.msg("姓名不能为空"),n.abrupt("return");case 9:if(e.ruleForm.xueshengzhanghao||"xuesheng"!=e.tableName){n.next=12;break}return e.$utils.msg("学生账号不能为空"),n.abrupt("return");case 12:if(e.ruleForm.mima||"xuesheng"!=e.tableName){n.next=15;break}return e.$utils.msg("密码不能为空"),n.abrupt("return");case 15:if(e.ruleForm.xueshengxingming||"xuesheng"!=e.tableName){n.next=18;break}return e.$utils.msg("学生姓名不能为空"),n.abrupt("return");case 18:if("xuesheng"!=e.tableName||!e.ruleForm.nianling||e.$validate.isIntNumer(e.ruleForm.nianling)){n.next=21;break}return e.$utils.msg("年龄应输入整数"),n.abrupt("return");case 21:if("xuesheng"!=e.tableName||!e.ruleForm.shouji||e.$validate.isMobile(e.ruleForm.shouji)){n.next=24;break}return e.$utils.msg("手机应输入手机格式"),n.abrupt("return");case 24:if("xuesheng"!=e.tableName||!e.ruleForm.youxiang||e.$validate.isEmail(e.ruleForm.youxiang)){n.next=27;break}return e.$utils.msg("邮箱应输入邮件格式"),n.abrupt("return");case 27:if("xuesheng"!=e.tableName||!e.ruleForm.shenfenzheng||e.$validate.checkIdCard(e.ruleForm.shenfenzheng)){n.next=30;break}return e.$utils.msg("身份证应输入身份证格式"),n.abrupt("return");case 30:return n.next=32,e.$api.register("".concat(e.tableName),e.ruleForm);case 32:e.$utils.msgBack("注册成功");case 34:case"end":return n.stop()}}),n)})))()}}};n.default=o}).call(this,t("543d")["default"])},e7f1:function(e,n,t){"use strict";t.r(n);var u=t("be4a"),a=t("4a4d");for(var r in a)"default"!==r&&function(e){t.d(n,e,(function(){return a[e]}))}(r);t("4c4e");var i,o=t("f0c5"),s=Object(o["a"])(a["default"],u["b"],u["c"],!1,null,"92c9baac",null,!1,u["a"],i);n["default"]=s.exports}},[["ca97","common/runtime","common/vendor"]]]);