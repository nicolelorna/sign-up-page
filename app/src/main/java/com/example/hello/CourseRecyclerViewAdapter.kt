package com.example.hello

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.course_item.view.*

class CourseRecyclerViewAdapter(
    private val courseList: List<Course>
) : RecyclerView.Adapter<CourseRecyclerViewAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.course_item, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {

        return courseList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val course = courseList[position]

        holder.itemView.also {
            it.name.text = course.courseName
            it.course_id.text = course.courseId.toString()
            it.instructor.text = course.instructor
            it.code.text = course.courseCode.toString()
            it.description.text = course.description

        }

    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}