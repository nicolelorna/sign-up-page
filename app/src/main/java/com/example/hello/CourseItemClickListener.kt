package com.example.hello

import com.example.hello.models.Course

interface CourseItemClickListener {
    fun onItemClick(course: Course)
}