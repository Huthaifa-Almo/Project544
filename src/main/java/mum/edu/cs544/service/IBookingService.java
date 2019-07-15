package mum.edu.cs544.service;

import mum.edu.cs544.domain.Booking;

import java.util.List;

public interface IBookingService {
    public void saveBooking(Booking booking);
    public Booking updateBooking(Booking booking);
    public void deletBooking(Long bookingId);
    public List<Booking> findAll();
    public Booking findOne(Long bookingId);
    public double getTotalCost(Long bookingId);
}
