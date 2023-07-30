# Exercise 2

Why is it usually preferred in using a lock for the lock() call to be executed before the try block and not within it (the first version below, not the second)? Provide arguments.

Lock before try:

someLock.lock();
try {
.....
}
finally {
someLock.unlock();
}

Lock within try:

try {
someLock.lock();
.....
}
finally {
someLock.unlock();
}

  We will demonstrate through the following example that using a lock within the try block can lead to a lack of mutual exclusion, thus making it preferable to use the first version presented in the request.

Let's assume the existence of two threads, A and B, where thread B has access to the critical section, and thread A is inside the try block, attempting to acquire the lock. If an exception is thrown inside the try block before thread A obtains permission to access the critical section, thread A will still execute the code inside the "finally" block, unlocking Thread B that is already in the critical section. In other words, Thread A releases the lock on the critical section that was locked by Thread B, implying that another arbitrary thread, X, might enter the critical section at the same time as B, thus violating mutual exclusion.
