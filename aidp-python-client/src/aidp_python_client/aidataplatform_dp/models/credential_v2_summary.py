# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class CredentialV2Summary(object):
    """
    Summary of the CredentialV2 Object.
    """

    #: A constant which can be used with the credential_type property of a CredentialV2Summary.
    #: This constant has a value of "SECRET_TOKEN"
    CREDENTIAL_TYPE_SECRET_TOKEN = "SECRET_TOKEN"

    #: A constant which can be used with the credential_type property of a CredentialV2Summary.
    #: This constant has a value of "VAULT_REFERENCE"
    CREDENTIAL_TYPE_VAULT_REFERENCE = "VAULT_REFERENCE"

    #: A constant which can be used with the credential_type property of a CredentialV2Summary.
    #: This constant has a value of "SERVICE_ACCOUNT"
    CREDENTIAL_TYPE_SERVICE_ACCOUNT = "SERVICE_ACCOUNT"

    #: A constant which can be used with the life_cycle_state property of a CredentialV2Summary.
    #: This constant has a value of "ACTIVE"
    LIFE_CYCLE_STATE_ACTIVE = "ACTIVE"

    #: A constant which can be used with the life_cycle_state property of a CredentialV2Summary.
    #: This constant has a value of "CREATING"
    LIFE_CYCLE_STATE_CREATING = "CREATING"

    #: A constant which can be used with the life_cycle_state property of a CredentialV2Summary.
    #: This constant has a value of "UPDATING"
    LIFE_CYCLE_STATE_UPDATING = "UPDATING"

    #: A constant which can be used with the life_cycle_state property of a CredentialV2Summary.
    #: This constant has a value of "DELETING"
    LIFE_CYCLE_STATE_DELETING = "DELETING"

    def __init__(self, **kwargs):
        """
        Initializes a new CredentialV2Summary object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param key:
            The value to assign to the key property of this CredentialV2Summary.
        :type key: str

        :param display_name:
            The value to assign to the display_name property of this CredentialV2Summary.
        :type display_name: str

        :param description:
            The value to assign to the description property of this CredentialV2Summary.
        :type description: str

        :param credential_type:
            The value to assign to the credential_type property of this CredentialV2Summary.
            Allowed values for this property are: "SECRET_TOKEN", "VAULT_REFERENCE", "SERVICE_ACCOUNT"
        :type credential_type: str

        :param time_created:
            The value to assign to the time_created property of this CredentialV2Summary.
        :type time_created: datetime

        :param created_by:
            The value to assign to the created_by property of this CredentialV2Summary.
        :type created_by: str

        :param time_updated:
            The value to assign to the time_updated property of this CredentialV2Summary.
        :type time_updated: datetime

        :param updated_by:
            The value to assign to the updated_by property of this CredentialV2Summary.
        :type updated_by: str

        :param life_cycle_state:
            The value to assign to the life_cycle_state property of this CredentialV2Summary.
            Allowed values for this property are: "ACTIVE", "CREATING", "UPDATING", "DELETING"
        :type life_cycle_state: str

        """
        self.swagger_types = {
            'key': 'str',
            'display_name': 'str',
            'description': 'str',
            'credential_type': 'str',
            'time_created': 'datetime',
            'created_by': 'str',
            'time_updated': 'datetime',
            'updated_by': 'str',
            'life_cycle_state': 'str'
        }

        self.attribute_map = {
            'key': 'key',
            'display_name': 'displayName',
            'description': 'description',
            'credential_type': 'credentialType',
            'time_created': 'timeCreated',
            'created_by': 'createdBy',
            'time_updated': 'timeUpdated',
            'updated_by': 'updatedBy',
            'life_cycle_state': 'lifeCycleState'
        }

        self._key = None
        self._display_name = None
        self._description = None
        self._credential_type = None
        self._time_created = None
        self._created_by = None
        self._time_updated = None
        self._updated_by = None
        self._life_cycle_state = None

    @property
    def key(self):
        """
        **[Required]** Gets the key of this CredentialV2Summary.
        The unique identifier for the credential object.


        :return: The key of this CredentialV2Summary.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this CredentialV2Summary.
        The unique identifier for the credential object.


        :param key: The key of this CredentialV2Summary.
        :type: str
        """
        self._key = key

    @property
    def display_name(self):
        """
        **[Required]** Gets the display_name of this CredentialV2Summary.
        A user-friendly name for the credential object. This value does not have to be unique and can be changed. Must start with a letter and contain only letters, numbers, or underscores. Avoid entering confidential information.


        :return: The display_name of this CredentialV2Summary.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this CredentialV2Summary.
        A user-friendly name for the credential object. This value does not have to be unique and can be changed. Must start with a letter and contain only letters, numbers, or underscores. Avoid entering confidential information.


        :param display_name: The display_name of this CredentialV2Summary.
        :type: str
        """
        self._display_name = display_name

    @property
    def description(self):
        """
        Gets the description of this CredentialV2Summary.
        A brief summary of the credential object and its purpose.


        :return: The description of this CredentialV2Summary.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this CredentialV2Summary.
        A brief summary of the credential object and its purpose.


        :param description: The description of this CredentialV2Summary.
        :type: str
        """
        self._description = description

    @property
    def credential_type(self):
        """
        **[Required]** Gets the credential_type of this CredentialV2Summary.
        The type of credential stored. Allowed values are defined in CredentialType.

        Allowed values for this property are: "SECRET_TOKEN", "VAULT_REFERENCE", "SERVICE_ACCOUNT"


        :return: The credential_type of this CredentialV2Summary.
        :rtype: str
        """
        return self._credential_type

    @credential_type.setter
    def credential_type(self, credential_type):
        """
        Sets the credential_type of this CredentialV2Summary.
        The type of credential stored. Allowed values are defined in CredentialType.


        :param credential_type: The credential_type of this CredentialV2Summary.
        :type: str
        """
        allowed_values = ["SECRET_TOKEN", "VAULT_REFERENCE", "SERVICE_ACCOUNT"]
        if not value_allowed_none_or_none_sentinel(credential_type, allowed_values):
            raise ValueError(
                "Invalid value for `credential_type`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._credential_type = credential_type

    @property
    def time_created(self):
        """
        Gets the time_created of this CredentialV2Summary.
        The date and time when the credential object was created, in RFC 3339 timestamp format.


        :return: The time_created of this CredentialV2Summary.
        :rtype: datetime
        """
        return self._time_created

    @time_created.setter
    def time_created(self, time_created):
        """
        Sets the time_created of this CredentialV2Summary.
        The date and time when the credential object was created, in RFC 3339 timestamp format.


        :param time_created: The time_created of this CredentialV2Summary.
        :type: datetime
        """
        self._time_created = time_created

    @property
    def created_by(self):
        """
        Gets the created_by of this CredentialV2Summary.
        The unique identifier of the user who created the credential object.


        :return: The created_by of this CredentialV2Summary.
        :rtype: str
        """
        return self._created_by

    @created_by.setter
    def created_by(self, created_by):
        """
        Sets the created_by of this CredentialV2Summary.
        The unique identifier of the user who created the credential object.


        :param created_by: The created_by of this CredentialV2Summary.
        :type: str
        """
        self._created_by = created_by

    @property
    def time_updated(self):
        """
        Gets the time_updated of this CredentialV2Summary.
        The date and time when the credential object was most recently updated, in RFC 3339 timestamp format.


        :return: The time_updated of this CredentialV2Summary.
        :rtype: datetime
        """
        return self._time_updated

    @time_updated.setter
    def time_updated(self, time_updated):
        """
        Sets the time_updated of this CredentialV2Summary.
        The date and time when the credential object was most recently updated, in RFC 3339 timestamp format.


        :param time_updated: The time_updated of this CredentialV2Summary.
        :type: datetime
        """
        self._time_updated = time_updated

    @property
    def updated_by(self):
        """
        Gets the updated_by of this CredentialV2Summary.
        The unique identifier of the user who last updated the credential object.


        :return: The updated_by of this CredentialV2Summary.
        :rtype: str
        """
        return self._updated_by

    @updated_by.setter
    def updated_by(self, updated_by):
        """
        Sets the updated_by of this CredentialV2Summary.
        The unique identifier of the user who last updated the credential object.


        :param updated_by: The updated_by of this CredentialV2Summary.
        :type: str
        """
        self._updated_by = updated_by

    @property
    def life_cycle_state(self):
        """
        Gets the life_cycle_state of this CredentialV2Summary.
        The current state of the credential object. Allowed values are defined in CredentialLifeCycleState.

        Allowed values for this property are: "ACTIVE", "CREATING", "UPDATING", "DELETING"


        :return: The life_cycle_state of this CredentialV2Summary.
        :rtype: str
        """
        return self._life_cycle_state

    @life_cycle_state.setter
    def life_cycle_state(self, life_cycle_state):
        """
        Sets the life_cycle_state of this CredentialV2Summary.
        The current state of the credential object. Allowed values are defined in CredentialLifeCycleState.


        :param life_cycle_state: The life_cycle_state of this CredentialV2Summary.
        :type: str
        """
        allowed_values = ["ACTIVE", "CREATING", "UPDATING", "DELETING"]
        if not value_allowed_none_or_none_sentinel(life_cycle_state, allowed_values):
            raise ValueError(
                "Invalid value for `life_cycle_state`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._life_cycle_state = life_cycle_state

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
