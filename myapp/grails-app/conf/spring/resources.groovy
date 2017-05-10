import demo.TestPersistenceEventListener

beans = {
    testPersistenceEventListener(TestPersistenceEventListener, ref('hibernateDatastore'))
}
