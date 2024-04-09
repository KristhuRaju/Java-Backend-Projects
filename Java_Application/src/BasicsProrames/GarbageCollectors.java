package BasicsProrames;

public class GarbageCollectors {
public static void main(String[] args) {
	Runtime rt= Runtime.getRuntime();
	System.out.println("Free memory in JVM Before GC :"+rt.freeMemory());
	rt.gc();
	System.out.println("Free memory in JVM After GC :"+rt.freeMemory());
}
}
