package com.alison.hairdressing.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/book")
public class BookingController {

    @PostMapping
    public String bookAppointment(@RequestBody BookingRequest request) {
        // Handle the booking logic here
        return "Booking confirmed for " + request.getName() + " on " + request.getDate();
    }
}

class BookingRequest {
    private String name;
    private String email;
    private String date;
    private String course;

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
