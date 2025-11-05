# E-commerce Checkout System - Payment Strategy Design

## Overview
This system demonstrates the use of the **Strategy Design Pattern** to support multiple payment methods in an e-commerce checkout flow. It enables flexible addition of new payment options without changing the core ordering logic.

---

## Key Components

- **OrderService**  
  Concrete class that orchestrates the order process and delegates payment behavior to a selected `PaymentStrategy`.

- **PaymentStrategy (Interface)**  
  Defines payment-related operations such as `pay(int amount)` (and optionally `refund(int amount)`).

- **Concrete Payment Strategies**  
  Examples include `CreditCardPaymentStrategy`, `UPIPaymentStrategy`, `CODPaymentStrategy`, each implementing payment behavior.

- **Refund Strategy**  
  Optional separate interface to handle refunds. Refund logic can be:
  - Implemented inside payment strategy classes (simpler, tightly coupled), or
  - Delegated to separate `RefundStrategy` implementations (cleaner separation, more flexible).

---

## Design Choices Explained

- **Why concrete OrderService instead of abstract?**  
  OrderService uses composition with payment strategies to support dynamic behavior at runtime. Subclassing OrderService per payment method would lead to tight coupling and poor scalability.

- **When to split payment and refund?**  
  If refund logic differs significantly or evolves independently, use a separate `RefundStrategy`. Otherwise, implement refund methods within the payment strategy classes for simplicity.

- **Preventing misuse**  
  Ensure a payment strategy is set before processing orders to avoid null references and enforce correct usage.

---

## Summary

This design provides a flexible, maintainable way to extend payment options using composition and strategy pattern principles, balancing simplicity and scalability.

---

## Class diagram

<img width="985" height="817" alt="image" src="https://github.com/user-attachments/assets/49743267-6ade-43a3-a2db-0da2b9f14f67" />

