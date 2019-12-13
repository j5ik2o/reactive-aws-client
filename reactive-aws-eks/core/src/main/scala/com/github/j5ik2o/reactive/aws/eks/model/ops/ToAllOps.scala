package com.github.j5ik2o.reactive.aws.eks.model.ops

import com.github.j5ik2o.reactive.aws.utils.ToOptionSupport

trait ToAllOps
extends ToOptionSupport with ToCertificateOps
 with ToClusterOps
 with ToCreateClusterRequestOps
 with ToCreateClusterResponseOps
 with ToDeleteClusterRequestOps
 with ToDeleteClusterResponseOps
 with ToDescribeClusterRequestOps
 with ToDescribeClusterResponseOps
 with ToDescribeUpdateRequestOps
 with ToDescribeUpdateResponseOps
 with ToErrorDetailOps
 with ToIdentityOps
 with ToListClustersRequestOps
 with ToListClustersResponseOps
 with ToListTagsForResourceRequestOps
 with ToListTagsForResourceResponseOps
 with ToListUpdatesRequestOps
 with ToListUpdatesResponseOps
 with ToLogSetupOps
 with ToLoggingOps
 with ToOIDCOps
 with ToTagResourceRequestOps
 with ToUntagResourceRequestOps
 with ToUpdateClusterConfigRequestOps
 with ToUpdateClusterConfigResponseOps
 with ToUpdateClusterVersionRequestOps
 with ToUpdateClusterVersionResponseOps
 with ToUpdateOps
 with ToUpdateParamOps
 with ToVpcConfigRequestOps
 with ToVpcConfigResponseOps
