import demo.TestPersistenceEventListener

// Place your Spring DSL code here
beans = {
    testPersistenceEventListener(TestPersistenceEventListener, ref('hibernateDatastore'))
}
