package preflistener.datasource_processor

import preflistener.Builder
import kotlinx.coroutines.CoroutineScope

interface DataHandlerProcessor {

    fun setUpdateDataListener(listener: (data: Builder.UpdatesObject) -> Unit)

    fun setWorkerScope(scope: CoroutineScope)

}
