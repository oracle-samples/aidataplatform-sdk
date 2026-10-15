# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class PrincipalAccessGrantedDetails(object):
    """
    Access checks for one subject.
    """

    #: A constant which can be used with the principal_type property of a PrincipalAccessGrantedDetails.
    #: This constant has a value of "SIGNED"
    PRINCIPAL_TYPE_SIGNED = "SIGNED"

    #: A constant which can be used with the principal_type property of a PrincipalAccessGrantedDetails.
    #: This constant has a value of "UNSIGNED"
    PRINCIPAL_TYPE_UNSIGNED = "UNSIGNED"

    def __init__(self, **kwargs):
        """
        Initializes a new PrincipalAccessGrantedDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param principal:
            The value to assign to the principal property of this PrincipalAccessGrantedDetails.
        :type principal: str

        :param principal_type:
            The value to assign to the principal_type property of this PrincipalAccessGrantedDetails.
            Allowed values for this property are: "SIGNED", "UNSIGNED"
        :type principal_type: str

        :param iam_check_access_type:
            The value to assign to the iam_check_access_type property of this PrincipalAccessGrantedDetails.
        :type iam_check_access_type: str

        :param auth_check_request_collection:
            The value to assign to the auth_check_request_collection property of this PrincipalAccessGrantedDetails.
        :type auth_check_request_collection: oci.aidataplatform_dp.models.AccessGrantedForRequestCollection

        """
        self.swagger_types = {
            'principal': 'str',
            'principal_type': 'str',
            'iam_check_access_type': 'str',
            'auth_check_request_collection': 'AccessGrantedForRequestCollection'
        }
        self.attribute_map = {
            'principal': 'principal',
            'principal_type': 'principalType',
            'iam_check_access_type': 'iamCheckAccessType',
            'auth_check_request_collection': 'authCheckRequestCollection'
        }
        self._principal = None
        self._principal_type = None
        self._iam_check_access_type = None
        self._auth_check_request_collection = None

    @property
    def principal(self):
        """
        Gets the principal of this PrincipalAccessGrantedDetails.
        Base64-encoded serialized OCI principal for an explicit subject. If omitted, use the resolved request
        identity. With principalType SIGNED, any supplied principal must match that identity.
        Base64 is a transport encoding, not proof of caller authorization.


        :return: The principal of this PrincipalAccessGrantedDetails.
        :rtype: str
        """
        return self._principal

    @principal.setter
    def principal(self, principal):
        """
        Sets the principal of this PrincipalAccessGrantedDetails.
        Base64-encoded serialized OCI principal for an explicit subject. If omitted, use the resolved request
        identity. With principalType SIGNED, any supplied principal must match that identity.
        Base64 is a transport encoding, not proof of caller authorization.


        :param principal: The principal of this PrincipalAccessGrantedDetails.
        :type: str
        """
        self._principal = principal

    @property
    def principal_type(self):
        """
        Gets the principal_type of this PrincipalAccessGrantedDetails.
        SIGNED selects the resolved request identity; UNSIGNED selects an explicit Base64 principal or falls back to the resolved identity.

        Allowed values for this property are: "SIGNED", "UNSIGNED"


        :return: The principal_type of this PrincipalAccessGrantedDetails.
        :rtype: str
        """
        return self._principal_type

    @principal_type.setter
    def principal_type(self, principal_type):
        """
        Sets the principal_type of this PrincipalAccessGrantedDetails.
        SIGNED selects the resolved request identity; UNSIGNED selects an explicit Base64 principal or falls back to the resolved identity.


        :param principal_type: The principal_type of this PrincipalAccessGrantedDetails.
        :type: str
        """
        allowed_values = ["SIGNED", "UNSIGNED"]
        if not value_allowed_none_or_none_sentinel(principal_type, allowed_values):
            raise ValueError(
                f"Invalid value for `principal_type`, must be None or one of {allowed_values}"
            )
        self._principal_type = principal_type

    @property
    def iam_check_access_type(self):
        """
        Gets the iam_check_access_type of this PrincipalAccessGrantedDetails.
        Optional IAM access check passed unchanged to Lakeproxy.


        :return: The iam_check_access_type of this PrincipalAccessGrantedDetails.
        :rtype: str
        """
        return self._iam_check_access_type

    @iam_check_access_type.setter
    def iam_check_access_type(self, iam_check_access_type):
        """
        Sets the iam_check_access_type of this PrincipalAccessGrantedDetails.
        Optional IAM access check passed unchanged to Lakeproxy.


        :param iam_check_access_type: The iam_check_access_type of this PrincipalAccessGrantedDetails.
        :type: str
        """
        self._iam_check_access_type = iam_check_access_type

    @property
    def auth_check_request_collection(self):
        """
        **[Required]** Gets the auth_check_request_collection of this PrincipalAccessGrantedDetails.

        :return: The auth_check_request_collection of this PrincipalAccessGrantedDetails.
        :rtype: oci.aidataplatform_dp.models.AccessGrantedForRequestCollection
        """
        return self._auth_check_request_collection

    @auth_check_request_collection.setter
    def auth_check_request_collection(self, auth_check_request_collection):
        """
        Sets the auth_check_request_collection of this PrincipalAccessGrantedDetails.

        :param auth_check_request_collection: The auth_check_request_collection of this PrincipalAccessGrantedDetails.
        :type: oci.aidataplatform_dp.models.AccessGrantedForRequestCollection
        """
        self._auth_check_request_collection = auth_check_request_collection

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
