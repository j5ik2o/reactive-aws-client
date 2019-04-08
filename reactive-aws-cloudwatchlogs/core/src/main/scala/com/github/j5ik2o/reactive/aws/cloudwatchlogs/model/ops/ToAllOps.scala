package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import com.github.j5ik2o.reactive.aws.utils.ToOptionSupport

trait ToAllOps
    extends ToOptionSupport
    with ToAssociateKmsKeyRequestOps
    with ToCancelExportTaskRequestOps
    with ToCreateExportTaskRequestOps
    with ToCreateExportTaskResponseOps
    with ToCreateLogGroupRequestOps
    with ToCreateLogStreamRequestOps
    with ToDeleteDestinationRequestOps
    with ToDeleteLogGroupRequestOps
    with ToDeleteLogStreamRequestOps
    with ToDeleteMetricFilterRequestOps
    with ToDeleteResourcePolicyRequestOps
    with ToDeleteRetentionPolicyRequestOps
    with ToDeleteSubscriptionFilterRequestOps
    with ToDescribeDestinationsRequestOps
    with ToDescribeDestinationsResponseOps
    with ToDescribeExportTasksRequestOps
    with ToDescribeExportTasksResponseOps
    with ToDescribeLogGroupsRequestOps
    with ToDescribeLogGroupsResponseOps
    with ToDescribeLogStreamsRequestOps
    with ToDescribeLogStreamsResponseOps
    with ToDescribeMetricFiltersRequestOps
    with ToDescribeMetricFiltersResponseOps
    with ToDescribeQueriesRequestOps
    with ToDescribeQueriesResponseOps
    with ToDescribeResourcePoliciesRequestOps
    with ToDescribeResourcePoliciesResponseOps
    with ToDescribeSubscriptionFiltersRequestOps
    with ToDescribeSubscriptionFiltersResponseOps
    with ToDestinationOps
    with ToDisassociateKmsKeyRequestOps
    with ToExportTaskExecutionInfoOps
    with ToExportTaskOps
    with ToExportTaskStatusOps
    with ToFilterLogEventsRequestOps
    with ToFilterLogEventsResponseOps
    with ToFilteredLogEventOps
    with ToGetLogEventsRequestOps
    with ToGetLogEventsResponseOps
    with ToGetLogGroupFieldsRequestOps
    with ToGetLogGroupFieldsResponseOps
    with ToGetLogRecordRequestOps
    with ToGetLogRecordResponseOps
    with ToGetQueryResultsRequestOps
    with ToGetQueryResultsResponseOps
    with ToInputLogEventOps
    with ToListTagsLogGroupRequestOps
    with ToListTagsLogGroupResponseOps
    with ToLogGroupFieldOps
    with ToLogGroupOps
    with ToLogStreamOps
    with ToMetricFilterMatchRecordOps
    with ToMetricFilterOps
    with ToMetricTransformationOps
    with ToOutputLogEventOps
    with ToPutDestinationPolicyRequestOps
    with ToPutDestinationRequestOps
    with ToPutDestinationResponseOps
    with ToPutLogEventsRequestOps
    with ToPutLogEventsResponseOps
    with ToPutMetricFilterRequestOps
    with ToPutResourcePolicyRequestOps
    with ToPutResourcePolicyResponseOps
    with ToPutRetentionPolicyRequestOps
    with ToPutSubscriptionFilterRequestOps
    with ToQueryCompileErrorLocationOps
    with ToQueryCompileErrorOps
    with ToQueryInfoOps
    with ToQueryStatisticsOps
    with ToRejectedLogEventsInfoOps
    with ToResourcePolicyOps
    with ToResultFieldOps
    with ToSearchedLogStreamOps
    with ToStartQueryRequestOps
    with ToStartQueryResponseOps
    with ToStopQueryRequestOps
    with ToStopQueryResponseOps
    with ToSubscriptionFilterOps
    with ToTagLogGroupRequestOps
    with ToTestMetricFilterRequestOps
    with ToTestMetricFilterResponseOps
    with ToUntagLogGroupRequestOps
