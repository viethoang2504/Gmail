package com.example.gmail

import android.os.Bundle
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val sampleData = listOf(
            ListItem(senderName = "David Brown", content = "Project Completion Notice: Your recent project has been successfully completed. Please review the final report and provide feedback.", time = "Today, 9:15 AM", isLike = false),
            ListItem(senderName = "Emma Wilson", content = "Payment Confirmation: We have received your payment. Thank you for your prompt response. Let us know if you have any issues with your account.", time = "Yesterday, 4:20 PM", isLike = true),
            ListItem(senderName = "Sophia Davis", content = "Quarterly Review Meeting: Don't forget about our quarterly review meeting next Wednesday. Be prepared to discuss progress and future plans.", time = "Oct 27, 11:00 AM", isLike = false),
            ListItem(senderName = "Liam Miller", content = "Important Policy Update: Please be informed about the latest updates in our company policies. Make sure to review them by the end of this week.", time = "Oct 26, 2:45 PM", isLike = true),
            ListItem(senderName = "Olivia Taylor", content = "Team Outing Invitation: Join us for an upcoming team outing on Saturday! It’s a great opportunity to relax and bond with colleagues.", time = "Oct 25, 3:00 PM", isLike = false),
            ListItem(senderName = "Ethan Anderson", content = "New Security Features Launched: We’ve enhanced our security protocols. Please update your app to the latest version for improved protection.", time = "Oct 24, 8:15 AM", isLike = true),
            ListItem(senderName = "Mia Martinez", content = "Customer Feedback Survey: Your input is invaluable to us! Take a few moments to complete our survey and help us serve you better.", time = "Oct 23, 10:50 AM", isLike = false),
            ListItem(senderName = "James Wilson", content = "Service Renewal Reminder: Your service is due for renewal in a few days. Please renew to avoid any interruption.", time = "Oct 22, 5:30 PM", isLike = true),
            ListItem(senderName = "Charlotte Lee", content = "Happy Birthday! We wish you all the best on your special day. Enjoy your celebration!", time = "Oct 21, 7:20 AM", isLike = false),
            ListItem(senderName = "Alexander King", content = "New Job Openings: We are hiring! Check out the latest job openings in our company and refer anyone who might be interested.", time = "Oct 20, 12:15 PM", isLike = true)
        )


        val listView: ListView = findViewById(R.id.listView)
        val adapter = CustomAdapter(this, sampleData)
        listView.adapter = adapter
    }
}