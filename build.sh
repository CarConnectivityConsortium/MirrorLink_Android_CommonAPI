android update project --path .
ant release

mkdir -p doc
pushd doc
javadoc -verbose  \
	           -windowtitle "MirrorLink Android Common API" \
	           -doctitle "MirrorLink Android Common API" \
             -overview ../src/com/mirrorlink/android/commonapi/overview.html \
 	           -classpath $ANDROID_SDK/platforms/android-14/android.jar \
	           ../src/com/mirrorlink/android/commonapi/*.java \
	           ../gen/com/mirrorlink/android/commonapi/I*.java
	           
popd
