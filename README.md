# CheckConnection

CheckConnection is an android application that helps verify the Internet connection on your mobile device.

You need permission to check the status of the network 

uses-permission android:name="android.permission.ACCESS_NETWORK_STATE"

This is the part of the code of interest

connectivityManager=(ConnectivityManager) getSystemService(CONNECTIVITY_SERVICE);
networkInfo=connectivityManager.getActiveNetworkInfo();
	if(networkInfo!=null&&networkInfo.isConnectedOrConnecting(){
		result="Connected";
	}else{
		result="Not connected";
	}
