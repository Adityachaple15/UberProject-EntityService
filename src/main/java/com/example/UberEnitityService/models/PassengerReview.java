package com.example.UberEnitityService.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class PassengerReview extends Review {
    @Column(nullable = false)
    private String PassengerReviewContent;
    @Column(nullable = false)
    private String PassengerRating;
}
