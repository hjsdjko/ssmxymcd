<template>
	<view class="content">
		<view :style='{"boxShadow":"0 0 2rpx #006633","backgroundColor":"rgba(247, 247, 247, 1)","borderColor":"rgba(0, 102, 51, 1)","margin":"0 0 0px 0","borderWidth":"0 0 0 60rpx","borderStyle":"solid","height":"88rpx"}' v-if="tableName=='gongyuguanliyuan'" class="cu-form-group">
			<view class="title" :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(0, 102, 51, 1)","textAlign":"left"}'>账号</view>
			<input  style="padding: 0 30upx" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0, 102, 51, 1)","borderRadius":"0px","color":"rgba(0, 102, 51, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"68rpx"}' v-model="ruleForm.zhanghao" placeholder="账号"></input>
		</view>
		<view :style='{"boxShadow":"0 0 2rpx #006633","backgroundColor":"rgba(247, 247, 247, 1)","borderColor":"rgba(0, 102, 51, 1)","margin":"0 0 0px 0","borderWidth":"0 0 0 60rpx","borderStyle":"solid","height":"88rpx"}' v-if="tableName=='gongyuguanliyuan'" class="cu-form-group">
			<view class="title" :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(0, 102, 51, 1)","textAlign":"left"}'>密码</view>
			<input type="password" style="padding: 0 30upx" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0, 102, 51, 1)","borderRadius":"0px","color":"rgba(0, 102, 51, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"68rpx"}' v-model="ruleForm.mima" placeholder="密码"></input>
		</view>
		<view :style='{"boxShadow":"0 0 2rpx #006633","backgroundColor":"rgba(247, 247, 247, 1)","borderColor":"rgba(0, 102, 51, 1)","margin":"0 0 0px 0","borderWidth":"0 0 0 60rpx","borderStyle":"solid","height":"88rpx"}' v-if="tableName=='gongyuguanliyuan'" class="cu-form-group">
			<view class="title" :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(0, 102, 51, 1)","textAlign":"left"}'>姓名</view>
			<input  style="padding: 0 30upx" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0, 102, 51, 1)","borderRadius":"0px","color":"rgba(0, 102, 51, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"68rpx"}' v-model="ruleForm.xingming" placeholder="姓名"></input>
		</view>
			<view v-if="tableName=='gongyuguanliyuan'" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(224, 227, 225, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none","height":"108rpx"}' class="cu-form-group select">
                                <view :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(0, 102, 51, 1)","textAlign":"left"}' class="title">性别</view>
                                <picker @change="gongyuguanliyuanxingbieChange" :value="gongyuguanliyuanxingbieIndex" :range="gongyuguanliyuanxingbieOptions">
                                        <view style="padding: 0 30upx" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0, 102, 51, 1)","borderRadius":"0px","color":"rgba(0, 102, 51, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"68rpx"}' class="uni-input picker-select-input">{{ruleForm.xingbie?ruleForm.xingbie:"请选择性别"}}</view>
                                </picker>
                        </view>
		<view :style='{"boxShadow":"0 0 2rpx #006633","backgroundColor":"rgba(247, 247, 247, 1)","borderColor":"rgba(0, 102, 51, 1)","margin":"0 0 0px 0","borderWidth":"0 0 0 60rpx","borderStyle":"solid","height":"88rpx"}' v-if="tableName=='gongyuguanliyuan'" class="cu-form-group">
			<view class="title" :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(0, 102, 51, 1)","textAlign":"left"}'>年龄</view>
			<input  style="padding: 0 30upx" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0, 102, 51, 1)","borderRadius":"0px","color":"rgba(0, 102, 51, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"68rpx"}' v-model="ruleForm.nianling" placeholder="年龄"></input>
		</view>
		<view :style='{"boxShadow":"0 0 2rpx #006633","backgroundColor":"rgba(247, 247, 247, 1)","borderColor":"rgba(0, 102, 51, 1)","margin":"0 0 0px 0","borderWidth":"0 0 0 60rpx","borderStyle":"solid","height":"88rpx"}' v-if="tableName=='gongyuguanliyuan'" class="cu-form-group">
			<view class="title" :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(0, 102, 51, 1)","textAlign":"left"}'>手机</view>
			<input  style="padding: 0 30upx" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0, 102, 51, 1)","borderRadius":"0px","color":"rgba(0, 102, 51, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"68rpx"}' v-model="ruleForm.shouji" placeholder="手机"></input>
		</view>
		<view :style='{"boxShadow":"0 0 2rpx #006633","backgroundColor":"rgba(247, 247, 247, 1)","borderColor":"rgba(0, 102, 51, 1)","margin":"0 0 0px 0","borderWidth":"0 0 0 60rpx","borderStyle":"solid","height":"88rpx"}' v-if="tableName=='gongyuguanliyuan'" class="cu-form-group">
			<view class="title" :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(0, 102, 51, 1)","textAlign":"left"}'>身份证</view>
			<input  style="padding: 0 30upx" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0, 102, 51, 1)","borderRadius":"0px","color":"rgba(0, 102, 51, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"68rpx"}' v-model="ruleForm.shenfenzheng" placeholder="身份证"></input>
		</view>
		<view :style='{"boxShadow":"0 0 2rpx #006633","backgroundColor":"rgba(247, 247, 247, 1)","borderColor":"rgba(0, 102, 51, 1)","margin":"0 0 0px 0","borderWidth":"0 0 0 60rpx","borderStyle":"solid","height":"88rpx"}' v-if="tableName=='gongyuguanliyuan'" @tap="gongyuguanliyuanzhaopianTap" class="cu-form-group" :class="left == 'left'?'':'active'">
			<view class="title" :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(0, 102, 51, 1)","textAlign":"left"}'>照片</view>
			<image :style='{"width":"76rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","borderRadius":"0","textAlign":"left","height":"76rpx"}' v-if="ruleForm.zhaopian" class="avator" :src="ruleForm.zhaopian" mode=""></image>
			<image :style='{"width":"76rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","borderRadius":"0","textAlign":"left","height":"76rpx"}' v-else class="avator" src="../../static/center/face.jpeg" mode=""></image>
		</view>
		<view :style='{"boxShadow":"0 0 2rpx #006633","backgroundColor":"rgba(247, 247, 247, 1)","borderColor":"rgba(0, 102, 51, 1)","margin":"0 0 0px 0","borderWidth":"0 0 0 60rpx","borderStyle":"solid","height":"88rpx"}' v-if="tableName=='xuesheng'" class="cu-form-group">
			<view class="title" :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(0, 102, 51, 1)","textAlign":"left"}'>学生账号</view>
			<input  style="padding: 0 30upx" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0, 102, 51, 1)","borderRadius":"0px","color":"rgba(0, 102, 51, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"68rpx"}' v-model="ruleForm.xueshengzhanghao" placeholder="学生账号"></input>
		</view>
		<view :style='{"boxShadow":"0 0 2rpx #006633","backgroundColor":"rgba(247, 247, 247, 1)","borderColor":"rgba(0, 102, 51, 1)","margin":"0 0 0px 0","borderWidth":"0 0 0 60rpx","borderStyle":"solid","height":"88rpx"}' v-if="tableName=='xuesheng'" class="cu-form-group">
			<view class="title" :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(0, 102, 51, 1)","textAlign":"left"}'>密码</view>
			<input type="password" style="padding: 0 30upx" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0, 102, 51, 1)","borderRadius":"0px","color":"rgba(0, 102, 51, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"68rpx"}' v-model="ruleForm.mima" placeholder="密码"></input>
		</view>
		<view :style='{"boxShadow":"0 0 2rpx #006633","backgroundColor":"rgba(247, 247, 247, 1)","borderColor":"rgba(0, 102, 51, 1)","margin":"0 0 0px 0","borderWidth":"0 0 0 60rpx","borderStyle":"solid","height":"88rpx"}' v-if="tableName=='xuesheng'" class="cu-form-group">
			<view class="title" :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(0, 102, 51, 1)","textAlign":"left"}'>学生姓名</view>
			<input  style="padding: 0 30upx" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0, 102, 51, 1)","borderRadius":"0px","color":"rgba(0, 102, 51, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"68rpx"}' v-model="ruleForm.xueshengxingming" placeholder="学生姓名"></input>
		</view>
			<view v-if="tableName=='xuesheng'" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(224, 227, 225, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none","height":"108rpx"}' class="cu-form-group select">
                                <view :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(0, 102, 51, 1)","textAlign":"left"}' class="title">楼层号</view>
                                <picker @change="xueshengloucenghaoChange" :value="xueshengloucenghaoIndex" :range="xueshengloucenghaoOptions">
                                        <view style="padding: 0 30upx" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0, 102, 51, 1)","borderRadius":"0px","color":"rgba(0, 102, 51, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"68rpx"}' class="uni-input picker-select-input">{{ruleForm.loucenghao?ruleForm.loucenghao:"请选择楼层号"}}</view>
                                </picker>
                        </view>
			<view v-if="tableName=='xuesheng'" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(224, 227, 225, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none","height":"108rpx"}' class="cu-form-group select">
                                <view :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(0, 102, 51, 1)","textAlign":"left"}' class="title">性别</view>
                                <picker @change="xueshengxingbieChange" :value="xueshengxingbieIndex" :range="xueshengxingbieOptions">
                                        <view style="padding: 0 30upx" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0, 102, 51, 1)","borderRadius":"0px","color":"rgba(0, 102, 51, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"68rpx"}' class="uni-input picker-select-input">{{ruleForm.xingbie?ruleForm.xingbie:"请选择性别"}}</view>
                                </picker>
                        </view>
		<view :style='{"boxShadow":"0 0 2rpx #006633","backgroundColor":"rgba(247, 247, 247, 1)","borderColor":"rgba(0, 102, 51, 1)","margin":"0 0 0px 0","borderWidth":"0 0 0 60rpx","borderStyle":"solid","height":"88rpx"}' v-if="tableName=='xuesheng'" class="cu-form-group">
			<view class="title" :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(0, 102, 51, 1)","textAlign":"left"}'>年龄</view>
			<input  style="padding: 0 30upx" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0, 102, 51, 1)","borderRadius":"0px","color":"rgba(0, 102, 51, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"68rpx"}' v-model="ruleForm.nianling" placeholder="年龄"></input>
		</view>
		<view :style='{"boxShadow":"0 0 2rpx #006633","backgroundColor":"rgba(247, 247, 247, 1)","borderColor":"rgba(0, 102, 51, 1)","margin":"0 0 0px 0","borderWidth":"0 0 0 60rpx","borderStyle":"solid","height":"88rpx"}' v-if="tableName=='xuesheng'" class="cu-form-group">
			<view class="title" :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(0, 102, 51, 1)","textAlign":"left"}'>手机</view>
			<input  style="padding: 0 30upx" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0, 102, 51, 1)","borderRadius":"0px","color":"rgba(0, 102, 51, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"68rpx"}' v-model="ruleForm.shouji" placeholder="手机"></input>
		</view>
		<view :style='{"boxShadow":"0 0 2rpx #006633","backgroundColor":"rgba(247, 247, 247, 1)","borderColor":"rgba(0, 102, 51, 1)","margin":"0 0 0px 0","borderWidth":"0 0 0 60rpx","borderStyle":"solid","height":"88rpx"}' v-if="tableName=='xuesheng'" class="cu-form-group">
			<view class="title" :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(0, 102, 51, 1)","textAlign":"left"}'>邮箱</view>
			<input  style="padding: 0 30upx" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0, 102, 51, 1)","borderRadius":"0px","color":"rgba(0, 102, 51, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"68rpx"}' v-model="ruleForm.youxiang" placeholder="邮箱"></input>
		</view>
		<view :style='{"boxShadow":"0 0 2rpx #006633","backgroundColor":"rgba(247, 247, 247, 1)","borderColor":"rgba(0, 102, 51, 1)","margin":"0 0 0px 0","borderWidth":"0 0 0 60rpx","borderStyle":"solid","height":"88rpx"}' v-if="tableName=='xuesheng'" class="cu-form-group">
			<view class="title" :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(0, 102, 51, 1)","textAlign":"left"}'>身份证</view>
			<input  style="padding: 0 30upx" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0, 102, 51, 1)","borderRadius":"0px","color":"rgba(0, 102, 51, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"68rpx"}' v-model="ruleForm.shenfenzheng" placeholder="身份证"></input>
		</view>
		<view :style='{"boxShadow":"0 0 2rpx #006633","backgroundColor":"rgba(247, 247, 247, 1)","borderColor":"rgba(0, 102, 51, 1)","margin":"0 0 0px 0","borderWidth":"0 0 0 60rpx","borderStyle":"solid","height":"88rpx"}' v-if="tableName=='xuesheng'" @tap="xueshengzhaopianTap" class="cu-form-group" :class="left == 'left'?'':'active'">
			<view class="title" :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(0, 102, 51, 1)","textAlign":"left"}'>照片</view>
			<image :style='{"width":"76rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","borderRadius":"0","textAlign":"left","height":"76rpx"}' v-if="ruleForm.zhaopian" class="avator" :src="ruleForm.zhaopian" mode=""></image>
			<image :style='{"width":"76rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","borderRadius":"0","textAlign":"left","height":"76rpx"}' v-else class="avator" src="../../static/center/face.jpeg" mode=""></image>
		</view>
		
		<view class="btn">
			<view class="box" :style="{width: 'auto'}">
				<button @tap="update()" class="cu-btn lg" :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,0) inset","backgroundColor":"rgba(153, 0, 51, 1)","borderColor":"rgba(153, 0, 51, 1)","borderRadius":"8rpx","color":"#fff","borderWidth":"0","width":"auto","fontSize":"32rpx","borderStyle":"solid","height":"80rpx"}'>保存</button>
			</view>

			<view class="box" :style="{width: 'auto'}">
				<button @tap="logout()" class="cu-btn lg" :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,0) inset","backgroundColor":"rgba(0, 102, 51, 1)","borderColor":"#E6A23C","borderRadius":"8rpx","color":"#fff","borderWidth":"0px","width":"auto","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}'>退出登录</button>
			</view>
		</view>
	</view>
</template>

<script>
	export default {
		data() {
			return {
				ruleForm: {
				},
				tableName:"",
				gongyuguanliyuanxingbieOptions: [],
				gongyuguanliyuanxingbieIndex: 0,
				xueshengloucenghaoOptions: [],
				xueshengloucenghaoIndex: 0,
				xueshengxingbieOptions: [],
				xueshengxingbieIndex: 0,
			}
		},
		async onLoad() {
			let table = uni.getStorageSync("nowTable");
			let res = await this.$api.session(table);
			this.ruleForm = res.data;
			this.tableName = table;
			// 自定义下拉框值
			if(this.tableName=='gongyuguanliyuan'){
				this.gongyuguanliyuanxingbieOptions = "男,女".split(',');
				this.gongyuguanliyuanxingbieOptions.forEach((item, index) => {
					if(item==this.ruleForm.xingbie) {
						this.gongyuguanliyuanxingbieIndex = index;
					}
				});
			}
			// 下拉框
			if(this.tableName=='xuesheng'){
				res = await this.$api.option(`loucengxinxi`,`louceng`,{});
				this.xueshengloucenghaoOptions = res.data;
				this.xueshengloucenghaoOptions.forEach((item, index) => {
					if(item==this.ruleForm.loucenghao) {
						this.xueshengloucenghaoIndex = index;
					}
				});
			}
			// 自定义下拉框值
			if(this.tableName=='xuesheng'){
				this.xueshengxingbieOptions = "男,女".split(',');
				this.xueshengxingbieOptions.forEach((item, index) => {
					if(item==this.ruleForm.xingbie) {
						this.xueshengxingbieIndex = index;
					}
				});
			}
			this.styleChange()
		},
		methods: {
                        // 下拉变化
                        gongyuguanliyuanxingbieChange(e) {
                                this.gongyuguanliyuanxingbieIndex = e.target.value
                                this.ruleForm.xingbie = this.gongyuguanliyuanxingbieOptions[this.gongyuguanliyuanxingbieIndex]
                        },
                        // 下拉变化
                        xueshengloucenghaoChange(e) {
                                this.xueshengloucenghaoIndex = e.target.value
                                this.ruleForm.loucenghao = this.xueshengloucenghaoOptions[this.xueshengloucenghaoIndex]
                        },
                        // 下拉变化
                        xueshengxingbieChange(e) {
                                this.xueshengxingbieIndex = e.target.value
                                this.ruleForm.xingbie = this.xueshengxingbieOptions[this.xueshengxingbieIndex]
                        },
			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.cu-form-group .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.userInfoForm.list.input.backgroundColor
					// })
				})
			},
			// 获取uuid
			getUUID () {
				return new Date().getTime();
			},
			logout() {
				uni.setStorageSync('token', '');
				this.$utils.jump('../login/login');
			},
			// 注册
			async update() {
				if((!this.ruleForm.zhanghao) && `gongyuguanliyuan` == this.tableName){
					this.$utils.msg(`账号不能为空`);
					return
				}
				if((!this.ruleForm.mima) && `gongyuguanliyuan` == this.tableName){
					this.$utils.msg(`密码不能为空`);
					return
				}
				if((!this.ruleForm.xingming) && `gongyuguanliyuan` == this.tableName){
					this.$utils.msg(`姓名不能为空`);
					return
				}
				if((!this.ruleForm.xueshengzhanghao) && `xuesheng` == this.tableName){
					this.$utils.msg(`学生账号不能为空`);
					return
				}
				if((!this.ruleForm.mima) && `xuesheng` == this.tableName){
					this.$utils.msg(`密码不能为空`);
					return
				}
				if((!this.ruleForm.xueshengxingming) && `xuesheng` == this.tableName){
					this.$utils.msg(`学生姓名不能为空`);
					return
				}
				if(`xuesheng` == this.tableName && this.ruleForm.nianling&&(!this.$validate.isIntNumer(this.ruleForm.nianling))){
					this.$utils.msg(`年龄应输入整数`);
					return
				}
				if(`xuesheng` == this.tableName && this.ruleForm.shouji&&(!this.$validate.isMobile(this.ruleForm.shouji))){
					this.$utils.msg(`手机应输入手机格式`);
					return
				}
				if(`xuesheng` == this.tableName && this.ruleForm.youxiang&&(!this.$validate.isEmail(this.ruleForm.youxiang))){
					this.$utils.msg(`邮箱应输入邮件格式`);
					return
				}
				if(`xuesheng` == this.tableName && this.ruleForm.shenfenzheng&&(!this.$validate.checkIdCard(this.ruleForm.shenfenzheng))){
					this.$utils.msg(`身份证应输入身份证格式`);
					return
				}
				let table = uni.getStorageSync("nowTable");
				await this.$api.update(table, this.ruleForm);
				this.$utils.msgBack('修改成功');;
			}

			,gongyuguanliyuanzhaopianTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.zhaopian = _this.$base.url + 'upload/' + res.file;
					_this.$forceUpdate();
				});
			}
			,xueshengzhaopianTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.zhaopian = _this.$base.url + 'upload/' + res.file;
					_this.$forceUpdate();
				});
			}
		}
	}
</script>

<style lang="scss" scoped>
	.content:after {
		position: fixed;
		top: 0;
		right: 0;
		left: 0;
		bottom: 0;
		content: '';
				background-attachment: fixed;
		background-size: cover;
		background-position: center;
	}

	.avator {
		width: 110upx;
		height: 110upx;
		border-radius: 50%;
		margin-left: 30upx;
	}
	
	.cu-form-group.active {
		justify-content: space-between;
	}

	.cu-btn {
		width: 100%;
	}

	.right-input {
		flex: 1;
		text-align: left;
		line-height: 68rpx;
	}
	.btn {
	  display: flex;
	  align-items: center;
	  justify-content: center;
	  flex-wrap: wrap;
	  padding: 20upx 0;
	}
	
	.box {
	  width: auto;
	  padding: 0 10upx;
	  box-sizing: border-box;
	  margin-bottom: 20upx;
	}
	
	.cu-btn {
	  width: 100% !important;
	}

.picker-select-input {
	line-height: 68rpx;
}
</style>
