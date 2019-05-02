package com.mytheta.kotlinapisample.app.controller

import com.mytheta.kotlinapisample.domain.model.User
import com.mytheta.kotlinapisample.domain.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
class UserController {

    @Autowired
    lateinit var userService: UserService

    // 全件取得
    @GetMapping("users")
    fun getUserList(): List<User> {
        return userService.getUserList()
    }

    // 1件取得
    @GetMapping("user/{id}")
    fun getUserById(@PathVariable("id") id: Int?): User {
        return userService.getUserById(id)
    }

    // 登録
    @PostMapping("/user")
    fun createUserById(@RequestBody user: User): List<User> {
        return userService.getInsertUser(user)
    }

    // 編集
    @PutMapping("/user/{id}")
    fun updateUserById(@PathVariable("id") id: Int, @RequestBody user: User): User {
        return userService.getUpdateUser(id, user)
    }

    // 削除
    @DeleteMapping("/user/{id}")
    fun deleteUserById(@PathVariable("id") id: Int?): User {
        return userService.getDeleteUserById(id)
    }
}
