package kr.ac.wku.listview_20231029

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ReportFragment.Companion.reportFragment
import kr.ac.wku.listview_20231029.adapters.StudentAdapter
import kr.ac.wku.listview_20231029.databinding.ActivityMainBinding
import kr.ac.wku.listview_20231029.datas.StudentData

class MainActivity : AppCompatActivity() {

    val mStudentList = ArrayList<StudentData>()

    lateinit var  mStdAdapter: StudentAdapter

    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

//        화면이 켜질때, 학생 목록을 ArrayList에 수기로 추가(임시 활용)

        mStudentList.add( StudentData("우승진", 1999, "010-8330-7259"))
        mStudentList.add( StudentData("박진우", 1999, "010-1256-4846"))
        mStudentList.add( StudentData("조영재", 1999, "010-7846-7467"))
        mStudentList.add( StudentData("탁혁재", 1999, "010-1253-2453"))
        mStudentList.add( StudentData("윤성필", 1999, "010-1247-6845"))

//        어댑터 변수도 객체 생성

        mStdAdapter = StudentAdapter(this, R.layout.student_list_item, mStudentList)

        binding.studentListView.adapter = mStdAdapter
    }
}