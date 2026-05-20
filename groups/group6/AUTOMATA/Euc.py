def euclidean_gcd_lcm(a, b):
    #Ensure m is the larger number
    m = max (a, b)
    n = min(a, b)

    print("Steps (Eclidean Algorithm): ")

    while n !=0:
        q = m // n
        r = m % n
        print(f"{m} = {n}({q}) + {r}")
        m, n = n, r

    gcd = m
    lcm = (a * b) // gcd

    print("\nGCD:", gcd)
   print("LCM:", f"{lcm:,}")

#input
while True:
    try:
        a = int(input("Enter first positive integer: "))
        b = int(input("Enter second postive integer: "))

        if a > 0 and b > 0:
            break
        else:
            print("Please enter positive integers only.\n")
    except ValueError:
        print("Invalid input! Please enter integers only.\n")
euclidean_gcd_lcm(a, b)