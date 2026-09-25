# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class DeploymentActivitySummary(object):
    """
    A deployment activity record for a table listing: the activity fields plus a minimal deployment_details snapshot (model name + served versions). The full configuration snapshot and the message comment are returned only by the single-activity read.
    """

    #: A constant which can be used with the operation_type property of a DeploymentActivitySummary.
    #: This constant has a value of "CREATE"
    OPERATION_TYPE_CREATE = "CREATE"

    #: A constant which can be used with the operation_type property of a DeploymentActivitySummary.
    #: This constant has a value of "EDIT"
    OPERATION_TYPE_EDIT = "EDIT"

    #: A constant which can be used with the operation_type property of a DeploymentActivitySummary.
    #: This constant has a value of "ACTIVATE"
    OPERATION_TYPE_ACTIVATE = "ACTIVATE"

    #: A constant which can be used with the operation_type property of a DeploymentActivitySummary.
    #: This constant has a value of "DEACTIVATE"
    OPERATION_TYPE_DEACTIVATE = "DEACTIVATE"

    #: A constant which can be used with the operation_type property of a DeploymentActivitySummary.
    #: This constant has a value of "ROLL_FORWARD"
    OPERATION_TYPE_ROLL_FORWARD = "ROLL_FORWARD"

    #: A constant which can be used with the operation_type property of a DeploymentActivitySummary.
    #: This constant has a value of "ROLL_BACK"
    OPERATION_TYPE_ROLL_BACK = "ROLL_BACK"

    #: A constant which can be used with the status property of a DeploymentActivitySummary.
    #: This constant has a value of "SUCCESS"
    STATUS_SUCCESS = "SUCCESS"

    #: A constant which can be used with the status property of a DeploymentActivitySummary.
    #: This constant has a value of "FAILURE"
    STATUS_FAILURE = "FAILURE"

    def __init__(self, **kwargs):
        """
        Initializes a new DeploymentActivitySummary object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param activity_id:
            The value to assign to the activity_id property of this DeploymentActivitySummary.
        :type activity_id: str

        :param operation_type:
            The value to assign to the operation_type property of this DeploymentActivitySummary.
            Allowed values for this property are: "CREATE", "EDIT", "ACTIVATE", "DEACTIVATE", "ROLL_FORWARD", "ROLL_BACK", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type operation_type: str

        :param status:
            The value to assign to the status property of this DeploymentActivitySummary.
            Allowed values for this property are: "SUCCESS", "FAILURE", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type status: str

        :param start_time:
            The value to assign to the start_time property of this DeploymentActivitySummary.
        :type start_time: str

        :param end_time:
            The value to assign to the end_time property of this DeploymentActivitySummary.
        :type end_time: str

        :param user:
            The value to assign to the user property of this DeploymentActivitySummary.
        :type user: str

        :param deployment_details:
            The value to assign to the deployment_details property of this DeploymentActivitySummary.
        :type deployment_details: oci.aidataplatform_dp.models.DeploymentDetailsSummary

        """
        self.swagger_types = {
            'activity_id': 'str',
            'operation_type': 'str',
            'status': 'str',
            'start_time': 'str',
            'end_time': 'str',
            'user': 'str',
            'deployment_details': 'DeploymentDetailsSummary'
        }

        self.attribute_map = {
            'activity_id': 'activity_id',
            'operation_type': 'operation_type',
            'status': 'status',
            'start_time': 'start_time',
            'end_time': 'end_time',
            'user': 'user',
            'deployment_details': 'deployment_details'
        }

        self._activity_id = None
        self._operation_type = None
        self._status = None
        self._start_time = None
        self._end_time = None
        self._user = None
        self._deployment_details = None

    @property
    def activity_id(self):
        """
        **[Required]** Gets the activity_id of this DeploymentActivitySummary.
        ID of the deployment activity.


        :return: The activity_id of this DeploymentActivitySummary.
        :rtype: str
        """
        return self._activity_id

    @activity_id.setter
    def activity_id(self, activity_id):
        """
        Sets the activity_id of this DeploymentActivitySummary.
        ID of the deployment activity.


        :param activity_id: The activity_id of this DeploymentActivitySummary.
        :type: str
        """
        self._activity_id = activity_id

    @property
    def operation_type(self):
        """
        **[Required]** Gets the operation_type of this DeploymentActivitySummary.
        Operation type of the activity.

        Allowed values for this property are: "CREATE", "EDIT", "ACTIVATE", "DEACTIVATE", "ROLL_FORWARD", "ROLL_BACK", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The operation_type of this DeploymentActivitySummary.
        :rtype: str
        """
        return self._operation_type

    @operation_type.setter
    def operation_type(self, operation_type):
        """
        Sets the operation_type of this DeploymentActivitySummary.
        Operation type of the activity.


        :param operation_type: The operation_type of this DeploymentActivitySummary.
        :type: str
        """
        allowed_values = ["CREATE", "EDIT", "ACTIVATE", "DEACTIVATE", "ROLL_FORWARD", "ROLL_BACK"]
        if not value_allowed_none_or_none_sentinel(operation_type, allowed_values):
            operation_type = 'UNKNOWN_ENUM_VALUE'
        self._operation_type = operation_type

    @property
    def status(self):
        """
        **[Required]** Gets the status of this DeploymentActivitySummary.
        Status of the activity.

        Allowed values for this property are: "SUCCESS", "FAILURE", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The status of this DeploymentActivitySummary.
        :rtype: str
        """
        return self._status

    @status.setter
    def status(self, status):
        """
        Sets the status of this DeploymentActivitySummary.
        Status of the activity.


        :param status: The status of this DeploymentActivitySummary.
        :type: str
        """
        allowed_values = ["SUCCESS", "FAILURE"]
        if not value_allowed_none_or_none_sentinel(status, allowed_values):
            status = 'UNKNOWN_ENUM_VALUE'
        self._status = status

    @property
    def start_time(self):
        """
        **[Required]** Gets the start_time of this DeploymentActivitySummary.
        Unix timestamp in milliseconds of when the activity started.


        :return: The start_time of this DeploymentActivitySummary.
        :rtype: str
        """
        return self._start_time

    @start_time.setter
    def start_time(self, start_time):
        """
        Sets the start_time of this DeploymentActivitySummary.
        Unix timestamp in milliseconds of when the activity started.


        :param start_time: The start_time of this DeploymentActivitySummary.
        :type: str
        """
        self._start_time = start_time

    @property
    def end_time(self):
        """
        **[Required]** Gets the end_time of this DeploymentActivitySummary.
        Unix timestamp in milliseconds of when the activity ended.


        :return: The end_time of this DeploymentActivitySummary.
        :rtype: str
        """
        return self._end_time

    @end_time.setter
    def end_time(self, end_time):
        """
        Sets the end_time of this DeploymentActivitySummary.
        Unix timestamp in milliseconds of when the activity ended.


        :param end_time: The end_time of this DeploymentActivitySummary.
        :type: str
        """
        self._end_time = end_time

    @property
    def user(self):
        """
        **[Required]** Gets the user of this DeploymentActivitySummary.
        User that created the activity.


        :return: The user of this DeploymentActivitySummary.
        :rtype: str
        """
        return self._user

    @user.setter
    def user(self, user):
        """
        Sets the user of this DeploymentActivitySummary.
        User that created the activity.


        :param user: The user of this DeploymentActivitySummary.
        :type: str
        """
        self._user = user

    @property
    def deployment_details(self):
        """
        Gets the deployment_details of this DeploymentActivitySummary.

        :return: The deployment_details of this DeploymentActivitySummary.
        :rtype: oci.aidataplatform_dp.models.DeploymentDetailsSummary
        """
        return self._deployment_details

    @deployment_details.setter
    def deployment_details(self, deployment_details):
        """
        Sets the deployment_details of this DeploymentActivitySummary.

        :param deployment_details: The deployment_details of this DeploymentActivitySummary.
        :type: oci.aidataplatform_dp.models.DeploymentDetailsSummary
        """
        self._deployment_details = deployment_details

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
