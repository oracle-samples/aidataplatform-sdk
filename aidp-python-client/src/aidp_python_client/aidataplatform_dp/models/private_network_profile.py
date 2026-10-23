# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class PrivateNetworkProfile(object):
    """
    A reusable private network profile for Git repository connectivity.
    """

    #: A constant which can be used with the lifecycle_state property of a PrivateNetworkProfile.
    #: This constant has a value of "CREATING"
    LIFECYCLE_STATE_CREATING = "CREATING"

    #: A constant which can be used with the lifecycle_state property of a PrivateNetworkProfile.
    #: This constant has a value of "ACTIVE"
    LIFECYCLE_STATE_ACTIVE = "ACTIVE"

    #: A constant which can be used with the lifecycle_state property of a PrivateNetworkProfile.
    #: This constant has a value of "DELETING"
    LIFECYCLE_STATE_DELETING = "DELETING"

    #: A constant which can be used with the lifecycle_state property of a PrivateNetworkProfile.
    #: This constant has a value of "FAILED"
    LIFECYCLE_STATE_FAILED = "FAILED"

    #: A constant which can be used with the validation_state property of a PrivateNetworkProfile.
    #: This constant has a value of "UNKNOWN"
    VALIDATION_STATE_UNKNOWN = "UNKNOWN"

    #: A constant which can be used with the validation_state property of a PrivateNetworkProfile.
    #: This constant has a value of "VALID"
    VALIDATION_STATE_VALID = "VALID"

    #: A constant which can be used with the validation_state property of a PrivateNetworkProfile.
    #: This constant has a value of "INVALID"
    VALIDATION_STATE_INVALID = "INVALID"

    def __init__(self, **kwargs):
        """
        Initializes a new PrivateNetworkProfile object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param key:
            The value to assign to the key property of this PrivateNetworkProfile.
        :type key: str

        :param name:
            The value to assign to the name property of this PrivateNetworkProfile.
        :type name: str

        :param description:
            The value to assign to the description property of this PrivateNetworkProfile.
        :type description: str

        :param customer_compartment_id:
            The value to assign to the customer_compartment_id property of this PrivateNetworkProfile.
        :type customer_compartment_id: str

        :param customer_vcn_id:
            The value to assign to the customer_vcn_id property of this PrivateNetworkProfile.
        :type customer_vcn_id: str

        :param customer_subnet_id:
            The value to assign to the customer_subnet_id property of this PrivateNetworkProfile.
        :type customer_subnet_id: str

        :param lifecycle_state:
            The value to assign to the lifecycle_state property of this PrivateNetworkProfile.
            Allowed values for this property are: "CREATING", "ACTIVE", "DELETING", "FAILED", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type lifecycle_state: str

        :param validation_state:
            The value to assign to the validation_state property of this PrivateNetworkProfile.
            Allowed values for this property are: "UNKNOWN", "VALID", "INVALID", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type validation_state: str

        :param time_last_validated:
            The value to assign to the time_last_validated property of this PrivateNetworkProfile.
        :type time_last_validated: datetime

        :param last_validation_error_code:
            The value to assign to the last_validation_error_code property of this PrivateNetworkProfile.
        :type last_validation_error_code: str

        :param last_validation_error_message:
            The value to assign to the last_validation_error_message property of this PrivateNetworkProfile.
        :type last_validation_error_message: str

        :param time_created:
            The value to assign to the time_created property of this PrivateNetworkProfile.
        :type time_created: datetime

        :param time_updated:
            The value to assign to the time_updated property of this PrivateNetworkProfile.
        :type time_updated: datetime

        :param created_by:
            The value to assign to the created_by property of this PrivateNetworkProfile.
        :type created_by: str

        :param created_by_name:
            The value to assign to the created_by_name property of this PrivateNetworkProfile.
        :type created_by_name: str

        """
        self.swagger_types = {
            'key': 'str',
            'name': 'str',
            'description': 'str',
            'customer_compartment_id': 'str',
            'customer_vcn_id': 'str',
            'customer_subnet_id': 'str',
            'lifecycle_state': 'str',
            'validation_state': 'str',
            'time_last_validated': 'datetime',
            'last_validation_error_code': 'str',
            'last_validation_error_message': 'str',
            'time_created': 'datetime',
            'time_updated': 'datetime',
            'created_by': 'str',
            'created_by_name': 'str'
        }
        self.attribute_map = {
            'key': 'key',
            'name': 'name',
            'description': 'description',
            'customer_compartment_id': 'customerCompartmentId',
            'customer_vcn_id': 'customerVcnId',
            'customer_subnet_id': 'customerSubnetId',
            'lifecycle_state': 'lifecycleState',
            'validation_state': 'validationState',
            'time_last_validated': 'timeLastValidated',
            'last_validation_error_code': 'lastValidationErrorCode',
            'last_validation_error_message': 'lastValidationErrorMessage',
            'time_created': 'timeCreated',
            'time_updated': 'timeUpdated',
            'created_by': 'createdBy',
            'created_by_name': 'createdByName'
        }
        self._key = None
        self._name = None
        self._description = None
        self._customer_compartment_id = None
        self._customer_vcn_id = None
        self._customer_subnet_id = None
        self._lifecycle_state = None
        self._validation_state = None
        self._time_last_validated = None
        self._last_validation_error_code = None
        self._last_validation_error_message = None
        self._time_created = None
        self._time_updated = None
        self._created_by = None
        self._created_by_name = None

    @property
    def key(self):
        """
        **[Required]** Gets the key of this PrivateNetworkProfile.
        Unique key for the Git connectivity profile.


        :return: The key of this PrivateNetworkProfile.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this PrivateNetworkProfile.
        Unique key for the Git connectivity profile.


        :param key: The key of this PrivateNetworkProfile.
        :type: str
        """
        self._key = key

    @property
    def name(self):
        """
        **[Required]** Gets the name of this PrivateNetworkProfile.
        Display name of the Git connectivity profile.


        :return: The name of this PrivateNetworkProfile.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this PrivateNetworkProfile.
        Display name of the Git connectivity profile.


        :param name: The name of this PrivateNetworkProfile.
        :type: str
        """
        self._name = name

    @property
    def description(self):
        """
        Gets the description of this PrivateNetworkProfile.
        Optional description of the Git connectivity profile.


        :return: The description of this PrivateNetworkProfile.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this PrivateNetworkProfile.
        Optional description of the Git connectivity profile.


        :param description: The description of this PrivateNetworkProfile.
        :type: str
        """
        self._description = description

    @property
    def customer_compartment_id(self):
        """
        **[Required]** Gets the customer_compartment_id of this PrivateNetworkProfile.
        Customer compartment identifier containing the private network resources.


        :return: The customer_compartment_id of this PrivateNetworkProfile.
        :rtype: str
        """
        return self._customer_compartment_id

    @customer_compartment_id.setter
    def customer_compartment_id(self, customer_compartment_id):
        """
        Sets the customer_compartment_id of this PrivateNetworkProfile.
        Customer compartment identifier containing the private network resources.


        :param customer_compartment_id: The customer_compartment_id of this PrivateNetworkProfile.
        :type: str
        """
        self._customer_compartment_id = customer_compartment_id

    @property
    def customer_vcn_id(self):
        """
        **[Required]** Gets the customer_vcn_id of this PrivateNetworkProfile.
        Customer VCN identifier used for Git connectivity.


        :return: The customer_vcn_id of this PrivateNetworkProfile.
        :rtype: str
        """
        return self._customer_vcn_id

    @customer_vcn_id.setter
    def customer_vcn_id(self, customer_vcn_id):
        """
        Sets the customer_vcn_id of this PrivateNetworkProfile.
        Customer VCN identifier used for Git connectivity.


        :param customer_vcn_id: The customer_vcn_id of this PrivateNetworkProfile.
        :type: str
        """
        self._customer_vcn_id = customer_vcn_id

    @property
    def customer_subnet_id(self):
        """
        **[Required]** Gets the customer_subnet_id of this PrivateNetworkProfile.
        Customer subnet identifier used for Git connectivity.


        :return: The customer_subnet_id of this PrivateNetworkProfile.
        :rtype: str
        """
        return self._customer_subnet_id

    @customer_subnet_id.setter
    def customer_subnet_id(self, customer_subnet_id):
        """
        Sets the customer_subnet_id of this PrivateNetworkProfile.
        Customer subnet identifier used for Git connectivity.


        :param customer_subnet_id: The customer_subnet_id of this PrivateNetworkProfile.
        :type: str
        """
        self._customer_subnet_id = customer_subnet_id

    @property
    def lifecycle_state(self):
        """
        **[Required]** Gets the lifecycle_state of this PrivateNetworkProfile.
        Current lifecycle state of the profile.

        Allowed values for this property are: "CREATING", "ACTIVE", "DELETING", "FAILED", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The lifecycle_state of this PrivateNetworkProfile.
        :rtype: str
        """
        return self._lifecycle_state

    @lifecycle_state.setter
    def lifecycle_state(self, lifecycle_state):
        """
        Sets the lifecycle_state of this PrivateNetworkProfile.
        Current lifecycle state of the profile.


        :param lifecycle_state: The lifecycle_state of this PrivateNetworkProfile.
        :type: str
        """
        allowed_values = ["CREATING", "ACTIVE", "DELETING", "FAILED"]
        if not value_allowed_none_or_none_sentinel(lifecycle_state, allowed_values):
            lifecycle_state = 'UNKNOWN_ENUM_VALUE'
        self._lifecycle_state = lifecycle_state

    @property
    def validation_state(self):
        """
        **[Required]** Gets the validation_state of this PrivateNetworkProfile.
        Latest validation state of the profile.

        Allowed values for this property are: "UNKNOWN", "VALID", "INVALID", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The validation_state of this PrivateNetworkProfile.
        :rtype: str
        """
        return self._validation_state

    @validation_state.setter
    def validation_state(self, validation_state):
        """
        Sets the validation_state of this PrivateNetworkProfile.
        Latest validation state of the profile.


        :param validation_state: The validation_state of this PrivateNetworkProfile.
        :type: str
        """
        allowed_values = ["UNKNOWN", "VALID", "INVALID"]
        if not value_allowed_none_or_none_sentinel(validation_state, allowed_values):
            validation_state = 'UNKNOWN_ENUM_VALUE'
        self._validation_state = validation_state

    @property
    def time_last_validated(self):
        """
        Gets the time_last_validated of this PrivateNetworkProfile.
        Time at which the profile was last validated.


        :return: The time_last_validated of this PrivateNetworkProfile.
        :rtype: datetime
        """
        return self._time_last_validated

    @time_last_validated.setter
    def time_last_validated(self, time_last_validated):
        """
        Sets the time_last_validated of this PrivateNetworkProfile.
        Time at which the profile was last validated.


        :param time_last_validated: The time_last_validated of this PrivateNetworkProfile.
        :type: datetime
        """
        self._time_last_validated = time_last_validated

    @property
    def last_validation_error_code(self):
        """
        Gets the last_validation_error_code of this PrivateNetworkProfile.
        Non-sensitive code for the latest validation failure.


        :return: The last_validation_error_code of this PrivateNetworkProfile.
        :rtype: str
        """
        return self._last_validation_error_code

    @last_validation_error_code.setter
    def last_validation_error_code(self, last_validation_error_code):
        """
        Sets the last_validation_error_code of this PrivateNetworkProfile.
        Non-sensitive code for the latest validation failure.


        :param last_validation_error_code: The last_validation_error_code of this PrivateNetworkProfile.
        :type: str
        """
        self._last_validation_error_code = last_validation_error_code

    @property
    def last_validation_error_message(self):
        """
        Gets the last_validation_error_message of this PrivateNetworkProfile.
        Non-sensitive message for the latest validation failure.


        :return: The last_validation_error_message of this PrivateNetworkProfile.
        :rtype: str
        """
        return self._last_validation_error_message

    @last_validation_error_message.setter
    def last_validation_error_message(self, last_validation_error_message):
        """
        Sets the last_validation_error_message of this PrivateNetworkProfile.
        Non-sensitive message for the latest validation failure.


        :param last_validation_error_message: The last_validation_error_message of this PrivateNetworkProfile.
        :type: str
        """
        self._last_validation_error_message = last_validation_error_message

    @property
    def time_created(self):
        """
        **[Required]** Gets the time_created of this PrivateNetworkProfile.
        Time at which the profile was created.


        :return: The time_created of this PrivateNetworkProfile.
        :rtype: datetime
        """
        return self._time_created

    @time_created.setter
    def time_created(self, time_created):
        """
        Sets the time_created of this PrivateNetworkProfile.
        Time at which the profile was created.


        :param time_created: The time_created of this PrivateNetworkProfile.
        :type: datetime
        """
        self._time_created = time_created

    @property
    def time_updated(self):
        """
        **[Required]** Gets the time_updated of this PrivateNetworkProfile.
        Time at which the profile was last updated.


        :return: The time_updated of this PrivateNetworkProfile.
        :rtype: datetime
        """
        return self._time_updated

    @time_updated.setter
    def time_updated(self, time_updated):
        """
        Sets the time_updated of this PrivateNetworkProfile.
        Time at which the profile was last updated.


        :param time_updated: The time_updated of this PrivateNetworkProfile.
        :type: datetime
        """
        self._time_updated = time_updated

    @property
    def created_by(self):
        """
        Gets the created_by of this PrivateNetworkProfile.
        Identifier of the user who created the profile.


        :return: The created_by of this PrivateNetworkProfile.
        :rtype: str
        """
        return self._created_by

    @created_by.setter
    def created_by(self, created_by):
        """
        Sets the created_by of this PrivateNetworkProfile.
        Identifier of the user who created the profile.


        :param created_by: The created_by of this PrivateNetworkProfile.
        :type: str
        """
        self._created_by = created_by

    @property
    def created_by_name(self):
        """
        Gets the created_by_name of this PrivateNetworkProfile.
        Display name of the user who created the profile.


        :return: The created_by_name of this PrivateNetworkProfile.
        :rtype: str
        """
        return self._created_by_name

    @created_by_name.setter
    def created_by_name(self, created_by_name):
        """
        Sets the created_by_name of this PrivateNetworkProfile.
        Display name of the user who created the profile.


        :param created_by_name: The created_by_name of this PrivateNetworkProfile.
        :type: str
        """
        self._created_by_name = created_by_name

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
