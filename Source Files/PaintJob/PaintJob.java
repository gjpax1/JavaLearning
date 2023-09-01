public class PaintJob {

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {

        if ((width <= 0) || (height <= 0) || (areaPerBucket) <= 0 || (extraBuckets < 0)) {
            return -1;
        }
        int numberOfBuckets = (int) Math.ceil((width*height-(areaPerBucket*extraBuckets))/areaPerBucket);

        if (numberOfBuckets < 0) {
            return 0;
        } else {
            return numberOfBuckets;
        }
        }

        public static int getBucketCount ( double width, double height, double areaPerBucket){

            if ((width <= 0) || (height <= 0) || (areaPerBucket <= 0)) {
                return -1;
            }
            int numberOfBuckets = (int)Math.ceil (((width * height) / areaPerBucket));
            if (numberOfBuckets < 0) {
                return 0;
            } else {
                return numberOfBuckets;
            }

        }

        public static int getBucketCount ( double area, double areaPerBucket){

            if ((area <= 0) || (areaPerBucket <= 0)) {
                return -1;
            }
            int numberOfBuckets = (int) Math.ceil ((area / areaPerBucket));
            if (numberOfBuckets < 0) {
                return 0;
            } else {
                return numberOfBuckets;


            }
        }

}
