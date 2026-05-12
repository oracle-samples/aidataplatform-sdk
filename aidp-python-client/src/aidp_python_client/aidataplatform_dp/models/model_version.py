# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ModelVersion(object):
    """
    Details of the model version
    """

    #: A constant which can be used with the status property of a ModelVersion.
    #: This constant has a value of "PENDING_REGISTRATION"
    STATUS_PENDING_REGISTRATION = "PENDING_REGISTRATION"

    #: A constant which can be used with the status property of a ModelVersion.
    #: This constant has a value of "FAILED_REGISTRATION"
    STATUS_FAILED_REGISTRATION = "FAILED_REGISTRATION"

    #: A constant which can be used with the status property of a ModelVersion.
    #: This constant has a value of "READY"
    STATUS_READY = "READY"

    def __init__(self, **kwargs):
        """
        Initializes a new ModelVersion object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param name:
            The value to assign to the name property of this ModelVersion.
        :type name: str

        :param version:
            The value to assign to the version property of this ModelVersion.
        :type version: str

        :param creation_timestamp:
            The value to assign to the creation_timestamp property of this ModelVersion.
        :type creation_timestamp: int

        :param last_updated_timestamp:
            The value to assign to the last_updated_timestamp property of this ModelVersion.
        :type last_updated_timestamp: int

        :param user_id:
            The value to assign to the user_id property of this ModelVersion.
        :type user_id: str

        :param current_stage:
            The value to assign to the current_stage property of this ModelVersion.
        :type current_stage: str

        :param description:
            The value to assign to the description property of this ModelVersion.
        :type description: str

        :param source:
            The value to assign to the source property of this ModelVersion.
        :type source: str

        :param run_id:
            The value to assign to the run_id property of this ModelVersion.
        :type run_id: str

        :param status:
            The value to assign to the status property of this ModelVersion.
            Allowed values for this property are: "PENDING_REGISTRATION", "FAILED_REGISTRATION", "READY", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type status: str

        :param status_message:
            The value to assign to the status_message property of this ModelVersion.
        :type status_message: str

        :param tags:
            The value to assign to the tags property of this ModelVersion.
        :type tags: list[oci.aidataplatform_dp.models.ModelVersionTag]

        :param run_link:
            The value to assign to the run_link property of this ModelVersion.
        :type run_link: str

        :param aliases:
            The value to assign to the aliases property of this ModelVersion.
        :type aliases: list[str]

        :param model_id:
            The value to assign to the model_id property of this ModelVersion.
        :type model_id: str

        :param model_metrics:
            The value to assign to the model_metrics property of this ModelVersion.
        :type model_metrics: list[oci.aidataplatform_dp.models.ModelMetric]

        :param model_params:
            The value to assign to the model_params property of this ModelVersion.
        :type model_params: list[oci.aidataplatform_dp.models.ModelParam]

        :param deployment_job_state:
            The value to assign to the deployment_job_state property of this ModelVersion.
        :type deployment_job_state: oci.aidataplatform_dp.models.ModelVersionDeploymentJobState

        """
        self.swagger_types = {
            'name': 'str',
            'version': 'str',
            'creation_timestamp': 'int',
            'last_updated_timestamp': 'int',
            'user_id': 'str',
            'current_stage': 'str',
            'description': 'str',
            'source': 'str',
            'run_id': 'str',
            'status': 'str',
            'status_message': 'str',
            'tags': 'list[ModelVersionTag]',
            'run_link': 'str',
            'aliases': 'list[str]',
            'model_id': 'str',
            'model_metrics': 'list[ModelMetric]',
            'model_params': 'list[ModelParam]',
            'deployment_job_state': 'ModelVersionDeploymentJobState'
        }

        self.attribute_map = {
            'name': 'name',
            'version': 'version',
            'creation_timestamp': 'creation_timestamp',
            'last_updated_timestamp': 'last_updated_timestamp',
            'user_id': 'user_id',
            'current_stage': 'current_stage',
            'description': 'description',
            'source': 'source',
            'run_id': 'run_id',
            'status': 'status',
            'status_message': 'status_message',
            'tags': 'tags',
            'run_link': 'run_link',
            'aliases': 'aliases',
            'model_id': 'model_id',
            'model_metrics': 'model_metrics',
            'model_params': 'model_params',
            'deployment_job_state': 'deployment_job_state'
        }

        self._name = None
        self._version = None
        self._creation_timestamp = None
        self._last_updated_timestamp = None
        self._user_id = None
        self._current_stage = None
        self._description = None
        self._source = None
        self._run_id = None
        self._status = None
        self._status_message = None
        self._tags = None
        self._run_link = None
        self._aliases = None
        self._model_id = None
        self._model_metrics = None
        self._model_params = None
        self._deployment_job_state = None

    @property
    def name(self):
        """
        Gets the name of this ModelVersion.
        Unique name for the model.


        :return: The name of this ModelVersion.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this ModelVersion.
        Unique name for the model.


        :param name: The name of this ModelVersion.
        :type: str
        """
        self._name = name

    @property
    def version(self):
        """
        Gets the version of this ModelVersion.
        Model\u2019s version number.


        :return: The version of this ModelVersion.
        :rtype: str
        """
        return self._version

    @version.setter
    def version(self, version):
        """
        Sets the version of this ModelVersion.
        Model\u2019s version number.


        :param version: The version of this ModelVersion.
        :type: str
        """
        self._version = version

    @property
    def creation_timestamp(self):
        """
        Gets the creation_timestamp of this ModelVersion.
        Timestamp in milliseconds when the model version was created.


        :return: The creation_timestamp of this ModelVersion.
        :rtype: int
        """
        return self._creation_timestamp

    @creation_timestamp.setter
    def creation_timestamp(self, creation_timestamp):
        """
        Sets the creation_timestamp of this ModelVersion.
        Timestamp in milliseconds when the model version was created.


        :param creation_timestamp: The creation_timestamp of this ModelVersion.
        :type: int
        """
        self._creation_timestamp = creation_timestamp

    @property
    def last_updated_timestamp(self):
        """
        Gets the last_updated_timestamp of this ModelVersion.
        Timestamp in milliseconds when metadata for the model version was last updated.


        :return: The last_updated_timestamp of this ModelVersion.
        :rtype: int
        """
        return self._last_updated_timestamp

    @last_updated_timestamp.setter
    def last_updated_timestamp(self, last_updated_timestamp):
        """
        Sets the last_updated_timestamp of this ModelVersion.
        Timestamp in milliseconds when metadata for the model version was last updated.


        :param last_updated_timestamp: The last_updated_timestamp of this ModelVersion.
        :type: int
        """
        self._last_updated_timestamp = last_updated_timestamp

    @property
    def user_id(self):
        """
        Gets the user_id of this ModelVersion.
        User that created this model version.


        :return: The user_id of this ModelVersion.
        :rtype: str
        """
        return self._user_id

    @user_id.setter
    def user_id(self, user_id):
        """
        Sets the user_id of this ModelVersion.
        User that created this model version.


        :param user_id: The user_id of this ModelVersion.
        :type: str
        """
        self._user_id = user_id

    @property
    def current_stage(self):
        """
        Gets the current_stage of this ModelVersion.
        Current stage for this model version.


        :return: The current_stage of this ModelVersion.
        :rtype: str
        """
        return self._current_stage

    @current_stage.setter
    def current_stage(self, current_stage):
        """
        Sets the current_stage of this ModelVersion.
        Current stage for this model version.


        :param current_stage: The current_stage of this ModelVersion.
        :type: str
        """
        self._current_stage = current_stage

    @property
    def description(self):
        """
        Gets the description of this ModelVersion.
        Description of this model version.


        :return: The description of this ModelVersion.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this ModelVersion.
        Description of this model version.


        :param description: The description of this ModelVersion.
        :type: str
        """
        self._description = description

    @property
    def source(self):
        """
        Gets the source of this ModelVersion.
        URI indicating the location of the source model artifacts, used when creating model version.


        :return: The source of this ModelVersion.
        :rtype: str
        """
        return self._source

    @source.setter
    def source(self, source):
        """
        Sets the source of this ModelVersion.
        URI indicating the location of the source model artifacts, used when creating model version.


        :param source: The source of this ModelVersion.
        :type: str
        """
        self._source = source

    @property
    def run_id(self):
        """
        Gets the run_id of this ModelVersion.
        Run ID used when creating model version.


        :return: The run_id of this ModelVersion.
        :rtype: str
        """
        return self._run_id

    @run_id.setter
    def run_id(self, run_id):
        """
        Sets the run_id of this ModelVersion.
        Run ID used when creating model version.


        :param run_id: The run_id of this ModelVersion.
        :type: str
        """
        self._run_id = run_id

    @property
    def status(self):
        """
        Gets the status of this ModelVersion.
        Current status of model version.

        Allowed values for this property are: "PENDING_REGISTRATION", "FAILED_REGISTRATION", "READY", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The status of this ModelVersion.
        :rtype: str
        """
        return self._status

    @status.setter
    def status(self, status):
        """
        Sets the status of this ModelVersion.
        Current status of model version.


        :param status: The status of this ModelVersion.
        :type: str
        """
        allowed_values = ["PENDING_REGISTRATION", "FAILED_REGISTRATION", "READY"]
        if not value_allowed_none_or_none_sentinel(status, allowed_values):
            status = 'UNKNOWN_ENUM_VALUE'
        self._status = status

    @property
    def status_message(self):
        """
        Gets the status_message of this ModelVersion.
        Details on current status, if it is pending or failed.


        :return: The status_message of this ModelVersion.
        :rtype: str
        """
        return self._status_message

    @status_message.setter
    def status_message(self, status_message):
        """
        Sets the status_message of this ModelVersion.
        Details on current status, if it is pending or failed.


        :param status_message: The status_message of this ModelVersion.
        :type: str
        """
        self._status_message = status_message

    @property
    def tags(self):
        """
        Gets the tags of this ModelVersion.
        Tags of model version.


        :return: The tags of this ModelVersion.
        :rtype: list[oci.aidataplatform_dp.models.ModelVersionTag]
        """
        return self._tags

    @tags.setter
    def tags(self, tags):
        """
        Sets the tags of this ModelVersion.
        Tags of model version.


        :param tags: The tags of this ModelVersion.
        :type: list[oci.aidataplatform_dp.models.ModelVersionTag]
        """
        self._tags = tags

    @property
    def run_link(self):
        """
        Gets the run_link of this ModelVersion.
        Run Link: Direct link to the run that generated this version.


        :return: The run_link of this ModelVersion.
        :rtype: str
        """
        return self._run_link

    @run_link.setter
    def run_link(self, run_link):
        """
        Sets the run_link of this ModelVersion.
        Run Link: Direct link to the run that generated this version.


        :param run_link: The run_link of this ModelVersion.
        :type: str
        """
        self._run_link = run_link

    @property
    def aliases(self):
        """
        Gets the aliases of this ModelVersion.
        Aliases pointing to this version.


        :return: The aliases of this ModelVersion.
        :rtype: list[str]
        """
        return self._aliases

    @aliases.setter
    def aliases(self, aliases):
        """
        Sets the aliases of this ModelVersion.
        Aliases pointing to this version.


        :param aliases: The aliases of this ModelVersion.
        :type: list[str]
        """
        self._aliases = aliases

    @property
    def model_id(self):
        """
        Gets the model_id of this ModelVersion.
        Model id for model version that is used to link the registered model to the source logged model.


        :return: The model_id of this ModelVersion.
        :rtype: str
        """
        return self._model_id

    @model_id.setter
    def model_id(self, model_id):
        """
        Sets the model_id of this ModelVersion.
        Model id for model version that is used to link the registered model to the source logged model.


        :param model_id: The model_id of this ModelVersion.
        :type: str
        """
        self._model_id = model_id

    @property
    def model_metrics(self):
        """
        Gets the model_metrics of this ModelVersion.
        Metrics logged for the model.


        :return: The model_metrics of this ModelVersion.
        :rtype: list[oci.aidataplatform_dp.models.ModelMetric]
        """
        return self._model_metrics

    @model_metrics.setter
    def model_metrics(self, model_metrics):
        """
        Sets the model_metrics of this ModelVersion.
        Metrics logged for the model.


        :param model_metrics: The model_metrics of this ModelVersion.
        :type: list[oci.aidataplatform_dp.models.ModelMetric]
        """
        self._model_metrics = model_metrics

    @property
    def model_params(self):
        """
        Gets the model_params of this ModelVersion.
        Parameters logged for the model.


        :return: The model_params of this ModelVersion.
        :rtype: list[oci.aidataplatform_dp.models.ModelParam]
        """
        return self._model_params

    @model_params.setter
    def model_params(self, model_params):
        """
        Sets the model_params of this ModelVersion.
        Parameters logged for the model.


        :param model_params: The model_params of this ModelVersion.
        :type: list[oci.aidataplatform_dp.models.ModelParam]
        """
        self._model_params = model_params

    @property
    def deployment_job_state(self):
        """
        Gets the deployment_job_state of this ModelVersion.

        :return: The deployment_job_state of this ModelVersion.
        :rtype: oci.aidataplatform_dp.models.ModelVersionDeploymentJobState
        """
        return self._deployment_job_state

    @deployment_job_state.setter
    def deployment_job_state(self, deployment_job_state):
        """
        Sets the deployment_job_state of this ModelVersion.

        :param deployment_job_state: The deployment_job_state of this ModelVersion.
        :type: oci.aidataplatform_dp.models.ModelVersionDeploymentJobState
        """
        self._deployment_job_state = deployment_job_state

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
