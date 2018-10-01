#lang racket

(define fib
  (lambda (x)
    (cond
      ([= x 0] 0)
      ([= x 1] 1)
      (else (+ (fib (- x 1))
              (fib (- x 2)))))))

(define prime?
  (lambda (x)
    (if (<= x 1))
       #f
       (let loop ([v (- x 1)])
         (cond
           ([= (remainder x v) 0] (= v 1))
           (else (loop (- v 1))))))))


(define primality-fiber
  (lambda (n)
    (filter (lambda (i) (prime? (fib i)))
           (for/list ([i (in-range 1 (+ n 1))]) i))))