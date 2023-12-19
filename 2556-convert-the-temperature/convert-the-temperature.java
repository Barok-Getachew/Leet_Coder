class Solution {
    public double[] convertTemperature(double celsius) {
       double[] ans = new double[2];

        double kelvin = celsius + 273.15;
        ans[0] = kelvin;

        double fahrenheit = (celsius * 1.8) + 32.00;
        ans[1] = fahrenheit;

        return ans;
    }
}