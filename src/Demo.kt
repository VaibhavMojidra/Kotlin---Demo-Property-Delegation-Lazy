//Refer to video on youtube : https://youtu.be/zW8oXDkUxCM or https://raw.githubusercontent.com/VaibhavMojidra/Kotlin---Demo-Delegation/master/reference_video/Delegation_In_Kotlin.mp4


fun main(args: Array<String>) {

	//	val n:Int by lazy(LazyThreadSafetyMode.SYNCHRONIZED){ 2 }
	//	val n:Int by lazy(LazyThreadSafetyMode.PUBLICATION){ 2 }
	//	val n:Int by lazy(LazyThreadSafetyMode.NONE){ 2 }

	//Will be initialized only when called

	val myVar: String by lazy {
		"Hello"
	}

	println(myVar + " My dear friend")

}