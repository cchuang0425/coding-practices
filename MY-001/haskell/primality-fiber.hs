main = putStr $ show $ primalityFiber 45

fib :: Integer -> Integer
fib n
  | n == 0 = 0
  | n == 1 = 1
  | otherwise = fib (n - 1) + fib (n - 2)


isPrime :: Integer -> Bool
isPrime n
  | n <= 1 = False
  | otherwise = isDivisor n (n - 1)
  where
    isDivisor n v
      | (n `mod` v) == 0 = (v == 1)
      | otherwise = isDivisor n (v - 1)


primalityFiber :: Integer -> [Integer]
primalityFiber n = [i | i <- [1..n], isPrime $ fib i]