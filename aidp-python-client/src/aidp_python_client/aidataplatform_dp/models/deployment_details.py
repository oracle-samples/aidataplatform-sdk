# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class DeploymentDetails(object):
    """
    Deployment configuration snapshot stored with an activity, recording the configuration the operation left behind. Every property is optional; a null value means the value is not available from any upstream system. Working out which values changed -- by comparing an activity against the one before it -- is left to the consumer.
    """

    #: A constant which can be used with the status property of a DeploymentDetails.
    #: This constant has a value of "INACTIVE"
    STATUS_INACTIVE = "INACTIVE"

    #: A constant which can be used with the status property of a DeploymentDetails.
    #: This constant has a value of "ACTIVATING"
    STATUS_ACTIVATING = "ACTIVATING"

    #: A constant which can be used with the status property of a DeploymentDetails.
    #: This constant has a value of "ACTIVE"
    STATUS_ACTIVE = "ACTIVE"

    #: A constant which can be used with the status property of a DeploymentDetails.
    #: This constant has a value of "DEACTIVATING"
    STATUS_DEACTIVATING = "DEACTIVATING"

    #: A constant which can be used with the status property of a DeploymentDetails.
    #: This constant has a value of "UPDATING"
    STATUS_UPDATING = "UPDATING"

    def __init__(self, **kwargs):
        """
        Initializes a new DeploymentDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param name:
            The value to assign to the name property of this DeploymentDetails.
        :type name: str

        :param description:
            The value to assign to the description property of this DeploymentDetails.
        :type description: str

        :param model_name:
            The value to assign to the model_name property of this DeploymentDetails.
        :type model_name: str

        :param deployment_targets:
            The value to assign to the deployment_targets property of this DeploymentDetails.
        :type deployment_targets: list[oci.aidataplatform_dp.models.DeploymentTarget]

        :param status:
            The value to assign to the status property of this DeploymentDetails.
            Allowed values for this property are: "INACTIVE", "ACTIVATING", "ACTIVE", "DEACTIVATING", "UPDATING", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type status: str

        :param endpoint:
            The value to assign to the endpoint property of this DeploymentDetails.
        :type endpoint: str

        :param tags:
            The value to assign to the tags property of this DeploymentDetails.
        :type tags: dict(str, str)

        :param workspace_key:
            The value to assign to the workspace_key property of this DeploymentDetails.
        :type workspace_key: str

        :param workspace_name:
            The value to assign to the workspace_name property of this DeploymentDetails.
        :type workspace_name: str

        :param compute_key:
            The value to assign to the compute_key property of this DeploymentDetails.
        :type compute_key: str

        :param compute_name:
            The value to assign to the compute_name property of this DeploymentDetails.
        :type compute_name: str

        :param ocpus:
            The value to assign to the ocpus property of this DeploymentDetails.
        :type ocpus: float

        :param memory_in_gbs:
            The value to assign to the memory_in_gbs property of this DeploymentDetails.
        :type memory_in_gbs: float

        :param autoscaling:
            The value to assign to the autoscaling property of this DeploymentDetails.
        :type autoscaling: bool

        :param min_instances:
            The value to assign to the min_instances property of this DeploymentDetails.
        :type min_instances: int

        :param max_instances:
            The value to assign to the max_instances property of this DeploymentDetails.
        :type max_instances: int

        :param instances:
            The value to assign to the instances property of this DeploymentDetails.
        :type instances: int

        :param concurrency:
            The value to assign to the concurrency property of this DeploymentDetails.
        :type concurrency: int

        :param cpu_target:
            The value to assign to the cpu_target property of this DeploymentDetails.
        :type cpu_target: int

        :param cooldown:
            The value to assign to the cooldown property of this DeploymentDetails.
        :type cooldown: int

        :param metric:
            The value to assign to the metric property of this DeploymentDetails.
        :type metric: str

        :param authorize_using:
            The value to assign to the authorize_using property of this DeploymentDetails.
        :type authorize_using: str

        :param audience_claim:
            The value to assign to the audience_claim property of this DeploymentDetails.
        :type audience_claim: list[str]

        :param issuer_claim:
            The value to assign to the issuer_claim property of this DeploymentDetails.
        :type issuer_claim: str

        :param jwks_uri:
            The value to assign to the jwks_uri property of this DeploymentDetails.
        :type jwks_uri: str

        """
        self.swagger_types = {
            'name': 'str',
            'description': 'str',
            'model_name': 'str',
            'deployment_targets': 'list[DeploymentTarget]',
            'status': 'str',
            'endpoint': 'str',
            'tags': 'dict(str, str)',
            'workspace_key': 'str',
            'workspace_name': 'str',
            'compute_key': 'str',
            'compute_name': 'str',
            'ocpus': 'float',
            'memory_in_gbs': 'float',
            'autoscaling': 'bool',
            'min_instances': 'int',
            'max_instances': 'int',
            'instances': 'int',
            'concurrency': 'int',
            'cpu_target': 'int',
            'cooldown': 'int',
            'metric': 'str',
            'authorize_using': 'str',
            'audience_claim': 'list[str]',
            'issuer_claim': 'str',
            'jwks_uri': 'str'
        }

        self.attribute_map = {
            'name': 'name',
            'description': 'description',
            'model_name': 'model_name',
            'deployment_targets': 'deployment_targets',
            'status': 'status',
            'endpoint': 'endpoint',
            'tags': 'tags',
            'workspace_key': 'workspaceKey',
            'workspace_name': 'workspaceName',
            'compute_key': 'computeKey',
            'compute_name': 'computeName',
            'ocpus': 'ocpus',
            'memory_in_gbs': 'memory_in_gbs',
            'autoscaling': 'autoscaling',
            'min_instances': 'min_instances',
            'max_instances': 'max_instances',
            'instances': 'instances',
            'concurrency': 'concurrency',
            'cpu_target': 'cpu_target',
            'cooldown': 'cooldown',
            'metric': 'metric',
            'authorize_using': 'authorize_using',
            'audience_claim': 'audience_claim',
            'issuer_claim': 'issuer_claim',
            'jwks_uri': 'jwks_uri'
        }

        self._name = None
        self._description = None
        self._model_name = None
        self._deployment_targets = None
        self._status = None
        self._endpoint = None
        self._tags = None
        self._workspace_key = None
        self._workspace_name = None
        self._compute_key = None
        self._compute_name = None
        self._ocpus = None
        self._memory_in_gbs = None
        self._autoscaling = None
        self._min_instances = None
        self._max_instances = None
        self._instances = None
        self._concurrency = None
        self._cpu_target = None
        self._cooldown = None
        self._metric = None
        self._authorize_using = None
        self._audience_claim = None
        self._issuer_claim = None
        self._jwks_uri = None

    @property
    def name(self):
        """
        Gets the name of this DeploymentDetails.
        Name of the deployment.


        :return: The name of this DeploymentDetails.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this DeploymentDetails.
        Name of the deployment.


        :param name: The name of this DeploymentDetails.
        :type: str
        """
        self._name = name

    @property
    def description(self):
        """
        Gets the description of this DeploymentDetails.
        Description of the deployment.


        :return: The description of this DeploymentDetails.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this DeploymentDetails.
        Description of the deployment.


        :param description: The description of this DeploymentDetails.
        :type: str
        """
        self._description = description

    @property
    def model_name(self):
        """
        Gets the model_name of this DeploymentDetails.
        Name of the registered model.


        :return: The model_name of this DeploymentDetails.
        :rtype: str
        """
        return self._model_name

    @model_name.setter
    def model_name(self, model_name):
        """
        Sets the model_name of this DeploymentDetails.
        Name of the registered model.


        :param model_name: The model_name of this DeploymentDetails.
        :type: str
        """
        self._model_name = model_name

    @property
    def deployment_targets(self):
        """
        Gets the deployment_targets of this DeploymentDetails.
        Deployment targets of the deployment.


        :return: The deployment_targets of this DeploymentDetails.
        :rtype: list[oci.aidataplatform_dp.models.DeploymentTarget]
        """
        return self._deployment_targets

    @deployment_targets.setter
    def deployment_targets(self, deployment_targets):
        """
        Sets the deployment_targets of this DeploymentDetails.
        Deployment targets of the deployment.


        :param deployment_targets: The deployment_targets of this DeploymentDetails.
        :type: list[oci.aidataplatform_dp.models.DeploymentTarget]
        """
        self._deployment_targets = deployment_targets

    @property
    def status(self):
        """
        Gets the status of this DeploymentDetails.
        Status of the deployment.

        Allowed values for this property are: "INACTIVE", "ACTIVATING", "ACTIVE", "DEACTIVATING", "UPDATING", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The status of this DeploymentDetails.
        :rtype: str
        """
        return self._status

    @status.setter
    def status(self, status):
        """
        Sets the status of this DeploymentDetails.
        Status of the deployment.


        :param status: The status of this DeploymentDetails.
        :type: str
        """
        allowed_values = ["INACTIVE", "ACTIVATING", "ACTIVE", "DEACTIVATING", "UPDATING"]
        if not value_allowed_none_or_none_sentinel(status, allowed_values):
            status = 'UNKNOWN_ENUM_VALUE'
        self._status = status

    @property
    def endpoint(self):
        """
        Gets the endpoint of this DeploymentDetails.
        Serving endpoint of the deployment.


        :return: The endpoint of this DeploymentDetails.
        :rtype: str
        """
        return self._endpoint

    @endpoint.setter
    def endpoint(self, endpoint):
        """
        Sets the endpoint of this DeploymentDetails.
        Serving endpoint of the deployment.


        :param endpoint: The endpoint of this DeploymentDetails.
        :type: str
        """
        self._endpoint = endpoint

    @property
    def tags(self):
        """
        Gets the tags of this DeploymentDetails.
        Tags of the deployment.


        :return: The tags of this DeploymentDetails.
        :rtype: dict(str, str)
        """
        return self._tags

    @tags.setter
    def tags(self, tags):
        """
        Sets the tags of this DeploymentDetails.
        Tags of the deployment.


        :param tags: The tags of this DeploymentDetails.
        :type: dict(str, str)
        """
        self._tags = tags

    @property
    def workspace_key(self):
        """
        Gets the workspace_key of this DeploymentDetails.
        Workspace key of the deployment.


        :return: The workspace_key of this DeploymentDetails.
        :rtype: str
        """
        return self._workspace_key

    @workspace_key.setter
    def workspace_key(self, workspace_key):
        """
        Sets the workspace_key of this DeploymentDetails.
        Workspace key of the deployment.


        :param workspace_key: The workspace_key of this DeploymentDetails.
        :type: str
        """
        self._workspace_key = workspace_key

    @property
    def workspace_name(self):
        """
        Gets the workspace_name of this DeploymentDetails.
        Display name of the deployment's workspace.


        :return: The workspace_name of this DeploymentDetails.
        :rtype: str
        """
        return self._workspace_name

    @workspace_name.setter
    def workspace_name(self, workspace_name):
        """
        Sets the workspace_name of this DeploymentDetails.
        Display name of the deployment's workspace.


        :param workspace_name: The workspace_name of this DeploymentDetails.
        :type: str
        """
        self._workspace_name = workspace_name

    @property
    def compute_key(self):
        """
        Gets the compute_key of this DeploymentDetails.
        Compute key of the deployment.


        :return: The compute_key of this DeploymentDetails.
        :rtype: str
        """
        return self._compute_key

    @compute_key.setter
    def compute_key(self, compute_key):
        """
        Sets the compute_key of this DeploymentDetails.
        Compute key of the deployment.


        :param compute_key: The compute_key of this DeploymentDetails.
        :type: str
        """
        self._compute_key = compute_key

    @property
    def compute_name(self):
        """
        Gets the compute_name of this DeploymentDetails.
        Display name of the compute cluster the deployment targets.


        :return: The compute_name of this DeploymentDetails.
        :rtype: str
        """
        return self._compute_name

    @compute_name.setter
    def compute_name(self, compute_name):
        """
        Sets the compute_name of this DeploymentDetails.
        Display name of the compute cluster the deployment targets.


        :param compute_name: The compute_name of this DeploymentDetails.
        :type: str
        """
        self._compute_name = compute_name

    @property
    def ocpus(self):
        """
        Gets the ocpus of this DeploymentDetails.
        OCPUs of the compute cluster shape.


        :return: The ocpus of this DeploymentDetails.
        :rtype: float
        """
        return self._ocpus

    @ocpus.setter
    def ocpus(self, ocpus):
        """
        Sets the ocpus of this DeploymentDetails.
        OCPUs of the compute cluster shape.


        :param ocpus: The ocpus of this DeploymentDetails.
        :type: float
        """
        self._ocpus = ocpus

    @property
    def memory_in_gbs(self):
        """
        Gets the memory_in_gbs of this DeploymentDetails.
        Memory in GB of the compute cluster shape.


        :return: The memory_in_gbs of this DeploymentDetails.
        :rtype: float
        """
        return self._memory_in_gbs

    @memory_in_gbs.setter
    def memory_in_gbs(self, memory_in_gbs):
        """
        Sets the memory_in_gbs of this DeploymentDetails.
        Memory in GB of the compute cluster shape.


        :param memory_in_gbs: The memory_in_gbs of this DeploymentDetails.
        :type: float
        """
        self._memory_in_gbs = memory_in_gbs

    @property
    def autoscaling(self):
        """
        Gets the autoscaling of this DeploymentDetails.
        Whether the compute cluster autoscales.


        :return: The autoscaling of this DeploymentDetails.
        :rtype: bool
        """
        return self._autoscaling

    @autoscaling.setter
    def autoscaling(self, autoscaling):
        """
        Sets the autoscaling of this DeploymentDetails.
        Whether the compute cluster autoscales.


        :param autoscaling: The autoscaling of this DeploymentDetails.
        :type: bool
        """
        self._autoscaling = autoscaling

    @property
    def min_instances(self):
        """
        Gets the min_instances of this DeploymentDetails.
        Minimum number of compute replicas.


        :return: The min_instances of this DeploymentDetails.
        :rtype: int
        """
        return self._min_instances

    @min_instances.setter
    def min_instances(self, min_instances):
        """
        Sets the min_instances of this DeploymentDetails.
        Minimum number of compute replicas.


        :param min_instances: The min_instances of this DeploymentDetails.
        :type: int
        """
        self._min_instances = min_instances

    @property
    def max_instances(self):
        """
        Gets the max_instances of this DeploymentDetails.
        Maximum number of compute replicas.


        :return: The max_instances of this DeploymentDetails.
        :rtype: int
        """
        return self._max_instances

    @max_instances.setter
    def max_instances(self, max_instances):
        """
        Sets the max_instances of this DeploymentDetails.
        Maximum number of compute replicas.


        :param max_instances: The max_instances of this DeploymentDetails.
        :type: int
        """
        self._max_instances = max_instances

    @property
    def instances(self):
        """
        Gets the instances of this DeploymentDetails.
        Number of replicas running. Not reported by AI Compute today, so always null.


        :return: The instances of this DeploymentDetails.
        :rtype: int
        """
        return self._instances

    @instances.setter
    def instances(self, instances):
        """
        Sets the instances of this DeploymentDetails.
        Number of replicas running. Not reported by AI Compute today, so always null.


        :param instances: The instances of this DeploymentDetails.
        :type: int
        """
        self._instances = instances

    @property
    def concurrency(self):
        """
        Gets the concurrency of this DeploymentDetails.
        Request concurrency. Not modelled by AI Compute today, so always null.


        :return: The concurrency of this DeploymentDetails.
        :rtype: int
        """
        return self._concurrency

    @concurrency.setter
    def concurrency(self, concurrency):
        """
        Sets the concurrency of this DeploymentDetails.
        Request concurrency. Not modelled by AI Compute today, so always null.


        :param concurrency: The concurrency of this DeploymentDetails.
        :type: int
        """
        self._concurrency = concurrency

    @property
    def cpu_target(self):
        """
        Gets the cpu_target of this DeploymentDetails.
        Autoscaling CPU target percentage. Not modelled by AI Compute today, so always null.


        :return: The cpu_target of this DeploymentDetails.
        :rtype: int
        """
        return self._cpu_target

    @cpu_target.setter
    def cpu_target(self, cpu_target):
        """
        Sets the cpu_target of this DeploymentDetails.
        Autoscaling CPU target percentage. Not modelled by AI Compute today, so always null.


        :param cpu_target: The cpu_target of this DeploymentDetails.
        :type: int
        """
        self._cpu_target = cpu_target

    @property
    def cooldown(self):
        """
        Gets the cooldown of this DeploymentDetails.
        Autoscaling cooldown in minutes. Not modelled by AI Compute today, so always null.


        :return: The cooldown of this DeploymentDetails.
        :rtype: int
        """
        return self._cooldown

    @cooldown.setter
    def cooldown(self, cooldown):
        """
        Sets the cooldown of this DeploymentDetails.
        Autoscaling cooldown in minutes. Not modelled by AI Compute today, so always null.


        :param cooldown: The cooldown of this DeploymentDetails.
        :type: int
        """
        self._cooldown = cooldown

    @property
    def metric(self):
        """
        Gets the metric of this DeploymentDetails.
        Autoscaling metric. Not modelled by AI Compute today, so always null.


        :return: The metric of this DeploymentDetails.
        :rtype: str
        """
        return self._metric

    @metric.setter
    def metric(self, metric):
        """
        Sets the metric of this DeploymentDetails.
        Autoscaling metric. Not modelled by AI Compute today, so always null.


        :param metric: The metric of this DeploymentDetails.
        :type: str
        """
        self._metric = metric

    @property
    def authorize_using(self):
        """
        Gets the authorize_using of this DeploymentDetails.
        Endpoint authorization mode: the deployment's authType (OAUTH or AIDP).


        :return: The authorize_using of this DeploymentDetails.
        :rtype: str
        """
        return self._authorize_using

    @authorize_using.setter
    def authorize_using(self, authorize_using):
        """
        Sets the authorize_using of this DeploymentDetails.
        Endpoint authorization mode: the deployment's authType (OAUTH or AIDP).


        :param authorize_using: The authorize_using of this DeploymentDetails.
        :type: str
        """
        self._authorize_using = authorize_using

    @property
    def audience_claim(self):
        """
        Gets the audience_claim of this DeploymentDetails.
        OAuth audience claims (aud). Set for OAUTH deployments; null otherwise.


        :return: The audience_claim of this DeploymentDetails.
        :rtype: list[str]
        """
        return self._audience_claim

    @audience_claim.setter
    def audience_claim(self, audience_claim):
        """
        Sets the audience_claim of this DeploymentDetails.
        OAuth audience claims (aud). Set for OAUTH deployments; null otherwise.


        :param audience_claim: The audience_claim of this DeploymentDetails.
        :type: list[str]
        """
        self._audience_claim = audience_claim

    @property
    def issuer_claim(self):
        """
        Gets the issuer_claim of this DeploymentDetails.
        OAuth issuer claim (iss). Set for OAUTH deployments; null otherwise.


        :return: The issuer_claim of this DeploymentDetails.
        :rtype: str
        """
        return self._issuer_claim

    @issuer_claim.setter
    def issuer_claim(self, issuer_claim):
        """
        Sets the issuer_claim of this DeploymentDetails.
        OAuth issuer claim (iss). Set for OAUTH deployments; null otherwise.


        :param issuer_claim: The issuer_claim of this DeploymentDetails.
        :type: str
        """
        self._issuer_claim = issuer_claim

    @property
    def jwks_uri(self):
        """
        Gets the jwks_uri of this DeploymentDetails.
        URI to retrieve the JWKS. Set for OAUTH deployments; null otherwise.


        :return: The jwks_uri of this DeploymentDetails.
        :rtype: str
        """
        return self._jwks_uri

    @jwks_uri.setter
    def jwks_uri(self, jwks_uri):
        """
        Sets the jwks_uri of this DeploymentDetails.
        URI to retrieve the JWKS. Set for OAUTH deployments; null otherwise.


        :param jwks_uri: The jwks_uri of this DeploymentDetails.
        :type: str
        """
        self._jwks_uri = jwks_uri

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
