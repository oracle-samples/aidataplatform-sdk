# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class CredentialV2(object):
    """
    Represents a credential object, which holds and manages credential resources.
    """

    #: A constant which can be used with the type property of a CredentialV2.
    #: This constant has a value of "SECRET_TOKEN"
    TYPE_SECRET_TOKEN = "SECRET_TOKEN"

    #: A constant which can be used with the type property of a CredentialV2.
    #: This constant has a value of "VAULT_REFERENCE"
    TYPE_VAULT_REFERENCE = "VAULT_REFERENCE"

    #: A constant which can be used with the type property of a CredentialV2.
    #: This constant has a value of "SERVICE_ACCOUNT"
    TYPE_SERVICE_ACCOUNT = "SERVICE_ACCOUNT"

    #: A constant which can be used with the lifecycle_state property of a CredentialV2.
    #: This constant has a value of "ACTIVE"
    LIFECYCLE_STATE_ACTIVE = "ACTIVE"

    #: A constant which can be used with the lifecycle_state property of a CredentialV2.
    #: This constant has a value of "CREATING"
    LIFECYCLE_STATE_CREATING = "CREATING"

    #: A constant which can be used with the lifecycle_state property of a CredentialV2.
    #: This constant has a value of "UPDATING"
    LIFECYCLE_STATE_UPDATING = "UPDATING"

    #: A constant which can be used with the lifecycle_state property of a CredentialV2.
    #: This constant has a value of "DELETING"
    LIFECYCLE_STATE_DELETING = "DELETING"

    def __init__(self, **kwargs):
        """
        Initializes a new CredentialV2 object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param key:
            The value to assign to the key property of this CredentialV2.
        :type key: str

        :param display_name:
            The value to assign to the display_name property of this CredentialV2.
        :type display_name: str

        :param type:
            The value to assign to the type property of this CredentialV2.
            Allowed values for this property are: "SECRET_TOKEN", "VAULT_REFERENCE", "SERVICE_ACCOUNT"
        :type type: str

        :param credential_details:
            The value to assign to the credential_details property of this CredentialV2.
        :type credential_details: oci.aidataplatform_dp.models.CredentialDetails

        :param credential_description:
            The value to assign to the credential_description property of this CredentialV2.
        :type credential_description: str

        :param lifecycle_state:
            The value to assign to the lifecycle_state property of this CredentialV2.
            Allowed values for this property are: "ACTIVE", "CREATING", "UPDATING", "DELETING"
        :type lifecycle_state: str

        :param lifecycle_state_details:
            The value to assign to the lifecycle_state_details property of this CredentialV2.
        :type lifecycle_state_details: str

        :param time_created:
            The value to assign to the time_created property of this CredentialV2.
        :type time_created: datetime

        :param time_updated:
            The value to assign to the time_updated property of this CredentialV2.
        :type time_updated: datetime

        :param created_by:
            The value to assign to the created_by property of this CredentialV2.
        :type created_by: str

        :param updated_by:
            The value to assign to the updated_by property of this CredentialV2.
        :type updated_by: str

        """
        self.swagger_types = {
            'key': 'str',
            'display_name': 'str',
            'type': 'str',
            'credential_details': 'CredentialDetails',
            'credential_description': 'str',
            'lifecycle_state': 'str',
            'lifecycle_state_details': 'str',
            'time_created': 'datetime',
            'time_updated': 'datetime',
            'created_by': 'str',
            'updated_by': 'str'
        }

        self.attribute_map = {
            'key': 'key',
            'display_name': 'displayName',
            'type': 'type',
            'credential_details': 'credentialDetails',
            'credential_description': 'credentialDescription',
            'lifecycle_state': 'lifecycleState',
            'lifecycle_state_details': 'lifecycleStateDetails',
            'time_created': 'timeCreated',
            'time_updated': 'timeUpdated',
            'created_by': 'createdBy',
            'updated_by': 'updatedBy'
        }

        self._key = None
        self._display_name = None
        self._type = None
        self._credential_details = None
        self._credential_description = None
        self._lifecycle_state = None
        self._lifecycle_state_details = None
        self._time_created = None
        self._time_updated = None
        self._created_by = None
        self._updated_by = None

    @property
    def key(self):
        """
        **[Required]** Gets the key of this CredentialV2.
        The unique identifier for the credential object.


        :return: The key of this CredentialV2.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this CredentialV2.
        The unique identifier for the credential object.


        :param key: The key of this CredentialV2.
        :type: str
        """
        self._key = key

    @property
    def display_name(self):
        """
        **[Required]** Gets the display_name of this CredentialV2.
        A user-friendly name for the credential object. This value does not have to be unique and can be changed. Must start with a letter and contain only letters, numbers, or underscores. Avoid entering confidential information.


        :return: The display_name of this CredentialV2.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this CredentialV2.
        A user-friendly name for the credential object. This value does not have to be unique and can be changed. Must start with a letter and contain only letters, numbers, or underscores. Avoid entering confidential information.


        :param display_name: The display_name of this CredentialV2.
        :type: str
        """
        self._display_name = display_name

    @property
    def type(self):
        """
        Gets the type of this CredentialV2.
        The type of credential stored. Allowed values are defined in CredentialType.

        Allowed values for this property are: "SECRET_TOKEN", "VAULT_REFERENCE", "SERVICE_ACCOUNT"


        :return: The type of this CredentialV2.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this CredentialV2.
        The type of credential stored. Allowed values are defined in CredentialType.


        :param type: The type of this CredentialV2.
        :type: str
        """
        allowed_values = ["SECRET_TOKEN", "VAULT_REFERENCE", "SERVICE_ACCOUNT"]
        if not value_allowed_none_or_none_sentinel(type, allowed_values):
            raise ValueError(
                "Invalid value for `type`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._type = type

    @property
    def credential_details(self):
        """
        Gets the credential_details of this CredentialV2.

        :return: The credential_details of this CredentialV2.
        :rtype: oci.aidataplatform_dp.models.CredentialDetails
        """
        return self._credential_details

    @credential_details.setter
    def credential_details(self, credential_details):
        """
        Sets the credential_details of this CredentialV2.

        :param credential_details: The credential_details of this CredentialV2.
        :type: oci.aidataplatform_dp.models.CredentialDetails
        """
        self._credential_details = credential_details

    @property
    def credential_description(self):
        """
        Gets the credential_description of this CredentialV2.
        A brief summary of the credential object and its purpose.


        :return: The credential_description of this CredentialV2.
        :rtype: str
        """
        return self._credential_description

    @credential_description.setter
    def credential_description(self, credential_description):
        """
        Sets the credential_description of this CredentialV2.
        A brief summary of the credential object and its purpose.


        :param credential_description: The credential_description of this CredentialV2.
        :type: str
        """
        self._credential_description = credential_description

    @property
    def lifecycle_state(self):
        """
        Gets the lifecycle_state of this CredentialV2.
        The current state of the credential object. Allowed values are defined in CredentialLifeCycleState.

        Allowed values for this property are: "ACTIVE", "CREATING", "UPDATING", "DELETING"


        :return: The lifecycle_state of this CredentialV2.
        :rtype: str
        """
        return self._lifecycle_state

    @lifecycle_state.setter
    def lifecycle_state(self, lifecycle_state):
        """
        Sets the lifecycle_state of this CredentialV2.
        The current state of the credential object. Allowed values are defined in CredentialLifeCycleState.


        :param lifecycle_state: The lifecycle_state of this CredentialV2.
        :type: str
        """
        allowed_values = ["ACTIVE", "CREATING", "UPDATING", "DELETING"]
        if not value_allowed_none_or_none_sentinel(lifecycle_state, allowed_values):
            raise ValueError(
                "Invalid value for `lifecycle_state`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._lifecycle_state = lifecycle_state

    @property
    def lifecycle_state_details(self):
        """
        Gets the lifecycle_state_details of this CredentialV2.
        Additional details or reasons regarding the current lifecycle state. Often used to provide actionable information (e.g., for resources in a Failed state).


        :return: The lifecycle_state_details of this CredentialV2.
        :rtype: str
        """
        return self._lifecycle_state_details

    @lifecycle_state_details.setter
    def lifecycle_state_details(self, lifecycle_state_details):
        """
        Sets the lifecycle_state_details of this CredentialV2.
        Additional details or reasons regarding the current lifecycle state. Often used to provide actionable information (e.g., for resources in a Failed state).


        :param lifecycle_state_details: The lifecycle_state_details of this CredentialV2.
        :type: str
        """
        self._lifecycle_state_details = lifecycle_state_details

    @property
    def time_created(self):
        """
        Gets the time_created of this CredentialV2.
        The date and time when the credential object was created, in RFC 3339 timestamp format.


        :return: The time_created of this CredentialV2.
        :rtype: datetime
        """
        return self._time_created

    @time_created.setter
    def time_created(self, time_created):
        """
        Sets the time_created of this CredentialV2.
        The date and time when the credential object was created, in RFC 3339 timestamp format.


        :param time_created: The time_created of this CredentialV2.
        :type: datetime
        """
        self._time_created = time_created

    @property
    def time_updated(self):
        """
        Gets the time_updated of this CredentialV2.
        The date and time when the credential object was most recently updated, in RFC 3339 timestamp format.


        :return: The time_updated of this CredentialV2.
        :rtype: datetime
        """
        return self._time_updated

    @time_updated.setter
    def time_updated(self, time_updated):
        """
        Sets the time_updated of this CredentialV2.
        The date and time when the credential object was most recently updated, in RFC 3339 timestamp format.


        :param time_updated: The time_updated of this CredentialV2.
        :type: datetime
        """
        self._time_updated = time_updated

    @property
    def created_by(self):
        """
        Gets the created_by of this CredentialV2.
        The unique identifier of the user who created the credential object.


        :return: The created_by of this CredentialV2.
        :rtype: str
        """
        return self._created_by

    @created_by.setter
    def created_by(self, created_by):
        """
        Sets the created_by of this CredentialV2.
        The unique identifier of the user who created the credential object.


        :param created_by: The created_by of this CredentialV2.
        :type: str
        """
        self._created_by = created_by

    @property
    def updated_by(self):
        """
        Gets the updated_by of this CredentialV2.
        The unique identifier of the user who last updated the credential object.


        :return: The updated_by of this CredentialV2.
        :rtype: str
        """
        return self._updated_by

    @updated_by.setter
    def updated_by(self, updated_by):
        """
        Sets the updated_by of this CredentialV2.
        The unique identifier of the user who last updated the credential object.


        :param updated_by: The updated_by of this CredentialV2.
        :type: str
        """
        self._updated_by = updated_by

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
