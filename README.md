# Warehouse Allocator

Allocation of automotive parts across warehouses of variable capacity, using bin-packing heuristics.

## The problem

A manufacturing plant receives batches of parts that occupy different amounts of space, and it has several warehouses with different capacities. The goal is to decide where each part should be stored so that space is used efficiently and no warehouse is overfilled.

This is a variant of the **bin packing problem** (NP-hard), so the project uses heuristics such as First Fit Decreasing instead of an exact solution.

## Status

Work in progress.

- [x] Core domain model (`Warehouse`, `Item`)
- [ ] Remaining capacity tracking
- [ ] First Fit Decreasing allocation
- [ ] REST API (Spring Boot)
- [ ] PostgreSQL persistence with Flyway migrations
- [ ] Movement history and lot traceability (FIFO)
- [ ] Docker Compose setup
- [ ] CI with GitHub Actions
- [ ] Benchmark of allocation strategies

## Tech stack

- Java 21
- Maven
- JUnit 5

Planned: Spring Boot, PostgreSQL, Flyway, Docker, GitHub Actions.

## Running the tests

```bash
mvn test
```

## Author

Ana M.— [GitHub](https://github.com/mtmm28)