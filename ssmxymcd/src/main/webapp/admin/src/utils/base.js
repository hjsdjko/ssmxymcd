const base = {
    get() {
                return {
            url : "http://localhost:8080/ssmxymcd/",
            name: "ssmxymcd",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmxymcd/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "学生公寓电费信息管理系统小程序"
        } 
    }
}
export default base
