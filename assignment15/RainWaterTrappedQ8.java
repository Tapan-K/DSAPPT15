package in.ineuron.assignment15;

class Rain {
    public int trap(int[] height) {
        int n = height.length;
        if (n == 0) {
            return 0;
        }

        int left = 0;
        int right = n - 1;
        int leftMax = 0;
        int rightMax = 0;
        int water = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] > leftMax) {
                    leftMax = height[left];
                } else {
                    water += leftMax - height[left];
                }
                left++;
            } else {
                if (height[right] > rightMax) {
                    rightMax = height[right];
                } else {
                    water += rightMax - height[right];
                }
                right--;
            }
        }

        return water;
    }
}

public class RainWaterTrappedQ8 {

	public static void main(String[] args) {
		// Question 8
		Rain rain = new Rain();
        int[] height = {0, 1, 0, 2, 1, 0, 3, 2, 1, 2, 1};
        int trappedWater = rain.trap(height);
        System.out.println("Trapped Water: " + trappedWater);

	}

}
