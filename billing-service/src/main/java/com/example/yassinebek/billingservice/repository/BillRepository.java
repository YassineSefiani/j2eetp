package com.example.yassinesef.billingservice.repository;

import com.example.yassinesef.billingservice.entites.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository  extends JpaRepository<Bill, Long> {
}
