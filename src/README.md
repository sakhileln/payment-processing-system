# Payment Processing System - Starter Code

## Files Overview:
```
src/
├── PaymentMethod.java
├── Refundable.java
├── RewardEarning.java
├── CreditCard.java
├── DebitCard.java
├── CryptoCurrency.java
├── PaymentProcessor.java
└── PaymentSystemTest.java
```

- Provided (DO NOT MODIFY):
    - `PaymentMethod.java` - Abstract base class
    - `Refundable.java` - Interface for refundable payments
    - `RewardEarning.java` - Interface for rewards

- Your Implementation Files:
  - `CreditCard.java` - 60% complete, fill in TODOs
  - `DebitCard.java` - 50% complete, fill in TODOs 
  - `CryptoCurrency.java` - 50% complete, fill in TODOs 
  - `PaymentProcessor.java` - 40% complete, fill in TODOs 
  - `PaymentSystemTest.java` - Test driver to verify your work

## What You Need To Do:
- Search for `// TODO:` comments - these tell you exactly what to implement
- Replace placeholder returns (`return false;, return null;`, etc.)
- Uncomment test code in PaymentSystemTest.java as you complete classes
- Answer the 5 conceptual questions at the bottom

### Implementation Order (Recommended):
- Start with CreditCard (most guidance provided)
- Then DebitCard (simpler than credit)
- Then CryptoCurrency (introduces new concepts)
- Finally PaymentProcessor (ties everything together with polymorphism)
- Complete PaymentSystemTest and test thoroughly

### Key Challenges to Watch For:
- `CreditCard`: Balance represents available credit (decreases with use)
- `DebitCard`: Balance represents actual money (can't go negative)
- `CryptoCurrency`: Variable fees + NOT refundable (no interface!)
- `PaymentProcessor`: Use `instanceof` to check for interfaces


---

## **Grading Rubric**

### Encapsulation (25 points)
- [ ] Proper use of private fields (5 pts)
- [ ] Appropriate getters/setters (5 pts)
- [ ] Protected balance usage (5 pts)
- [ ] Prevention of invalid states (10 pts)

### Abstraction (25 points)
- [ ] Proper abstract method implementation (10 pts)
- [ ] Correct interface implementation (10 pts)
- [ ] Meaningful method signatures (5 pts)

### Inheritance (25 points)
- [ ] Proper constructor chaining (10 pts)
- [ ] Appropriate method overriding (10 pts)
- [ ] Correct use of parent class features (5 pts)

### Polymorphism (25 points)
- [ ] PaymentProcessor handles all types uniformly (10 pts)
- [ ] Correct use of instanceof for interface checking (5 pts)
- [ ] Runtime polymorphic behavior (10 pts)

---

## **Conceptual Questions** (Answer in comments)
1. **Encapsulation**: Why is `balance` protected instead of private in `PaymentMethod`? What are the tradeoffs?
2. **Abstraction**: Why use an abstract class for `PaymentMethod` instead of an interface? When would you choose one over the other?
3. **Inheritance**: What problems could arise if we added too many concrete methods to `PaymentMethod`? How does this relate to Liskov Substitution Principle?
4. **Polymorphism**: How does `PaymentProcessor` treat different payment types uniformly while preserving unique behaviors? Give a specific example.
