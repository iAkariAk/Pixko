# Pixko

Pixco是一个适用于pixiv-android的库

## 引入

```kotlin
implementation("top.kagg886:pixko:${pixiv_version}")
```

## 功能

- [x] 登录类
    - [x] 基于pixiv scheme 回调url登录
    - [x] 基于access_token的登录
- [x] 插画类
    - [x] 获取推荐插画
    - [x] 查看插画榜单
    - [x] 查看插画详情
    - [ ] 收藏插画
      - [x] 仅收藏
      - [ ] 按TAG收藏
    - [x] 评论插画
      - [x] (发布/删除)新评论
      - [x] (查看/回复)评论下的回复
- [ ] 小说集类
    - [ ] 获取小说代表的小说集
- [ ] 小说类
    - [x] 获取推荐小说
    - [x] 查看小说榜单
    - [x] 查看小说详情
    - [x] 获取小说正文
    - [ ] 收藏小说
        - [x] 仅收藏
        - [ ] 按TAG收藏
    - [x] 评论小说
        - [x] (发布/删除)评论
        - [x] (查看/回复)评论下的回复
- [x] 搜索类
    - [x] 搜索插画
    - [x] 搜索用户
    - [x] 搜索小说
    - [x] tag自动补全
- [x] 动态类
    - [x] 查看关注的小说动态
    - [x] 查看关注的插画动态
- [x] 用户类
    - [x] 获取用户上传的插画
    - [ ] 获取用户上传的小说
    - [x] 获取用户的id,昵称等个人信息
    - [x] 获取用户填写的性别等个人信息
    - [x] (获取/提交)用户的作业环境
    - [x] 获取用户的收藏插画
      - [x] 过滤因访问限制而无法访问的插画
    - [x] 获取用户收藏的小说
    - [x] 编辑用户个人资料
    - [x] (关注/取消关注)用户
    - [ ] 获得用户的关注列表
    - [ ] 获得自己的粉丝列表