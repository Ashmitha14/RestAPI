package com.example.demo4.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Job")
public class Job {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Long jobId;
    String jobTitle;
    int minSalary;
    String jobDescription;
    int maxSalary;
    public Long getJobId() {
        return jobId;
    }
    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }
    public String getJobTitle() {
        return jobTitle;
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    public int getMinSalary() {
        return minSalary;
    }
    public void setMinSalary(int minSalary) {
        this.minSalary = minSalary;
    }
    public String getJobDescription() {
        return jobDescription;
    }
    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }
    public int getMaxSalary() {
        return maxSalary;
    }
    public void setMaxSalary(int maxSalary) {
        this.maxSalary = maxSalary;
    }
}

// package com.example.springapp.model;

// import javax.persistence.Entity;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
// import javax.persistence.Id;
// import javax.persistence.Table;

// @Entity
// @Table(name="Jobs")
// public class Job {
//     @Id
//     @GeneratedValue(strategy =GenerationType.IDENTITY)
//     int jobid;
//     String jobTitle;
//     int minSalary;
//     String jobDescription;
//     int maxSalary;
//     public int getJobid() {
//         return jobid;
//     }
//     public void setJobid(int jobid) {
//         this.jobid = jobid;
//     }
//     public String getJobTitle() {
//         return jobTitle;
//     }
//     public void setJobTitle(String jobTitle) {
//         this.jobTitle = jobTitle;
//     }
//     public int getMinSalary() {
//         return minSalary;
//     }
//     public void setMinSalary(int minSalary) {
//         this.minSalary = minSalary;
//     }
//     public String getJobDescription() {
//         return jobDescription;
//     }
//     public void setJobDescription(String jobDescription) {
//         this.jobDescription = jobDescription;
//     }
//     public int getMaxSalary() {
//         return maxSalary;
//     }
//     public void setMaxSalary(int maxSalary) {
//         this.maxSalary = maxSalary;
//     }
    
    
// }