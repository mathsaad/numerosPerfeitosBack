package com.propz.fullstack.atividade.util;

import com.propz.fullstack.atividade.model.PerfectNumberRange;

import java.util.ArrayList;
import java.util.List;

public class PerfectNumberUtil {
    public boolean isPerfect(Long n)
    {
        // To store sum of divisors
        long sum = 1L;

        // Find all divisors and add them
        for (Long i = 2L; i * i <= n; i++)
        {
            if (n % i==0)
            {
                if(i * i != n)
                    sum = sum + i + n / i;
                else
                    sum = sum + i;
            }
        }
        // If sum of divisors is equal to
        // n, then n is a perfect number
        return sum == n && n != 1;
    }

    public List<Long> findBetweenNumbers(PerfectNumberRange perfectNumberRange, List<Long> perfectNumbers) {
        long num1 = perfectNumberRange.getNumber1().getPerfectNumber();
        long num2 = perfectNumberRange.getNumber2().getPerfectNumber();
        if (num1 > num2) {

            long temp = num1;

            num1 = num2;

            num2 = temp;

        }

        List<Long> result = new ArrayList<>();

        for (Long number : perfectNumbers) {

            if (number >= num1 && number <= num2) {

                result.add(number);

            }

        }
        return result;
    }
}
