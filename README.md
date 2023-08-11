# springboot-auth
提供一套后端权限系统，根据 https://github.com/Heeexy/SpringBoot-Shiro-Vue.git 修改
并提供打镜像与学习窗口



- 打镜像
- 数据库选择
- 访问前端

## 打镜像
  ```
  在本目录下有个docker目录，里面记载了Dockerfile和启动docker-compose.yml文件
  nginx配置文件和启动文件
  
  我们需要做的是将打镜像需要的文件准备齐全
   1.后端jar包
   2.前端静态文件
  ```
## 数据库选择
  ```
  数据库以mysql为例，初始化db.sql在后端sql文件夹下
  ```
## 访问前端
   ```
   localhost:9520
   ```



# 一个完整的启动流程
```shell
# 打开后端
vim application.xml
修改数据库
找到sql文件，初始化数据库

# 打开前端
npm i
npm run dev
npm run build
```