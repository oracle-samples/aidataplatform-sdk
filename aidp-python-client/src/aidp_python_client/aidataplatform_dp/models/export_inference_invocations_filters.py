# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ExportInferenceInvocationsFilters(object):
    """
    Optional exact-match filters applied to correlated inference invocations before export.
    """

    #: A constant which can be used with the status property of a ExportInferenceInvocationsFilters.
    #: This constant has a value of "SUCCESS"
    STATUS_SUCCESS = "SUCCESS"

    #: A constant which can be used with the status property of a ExportInferenceInvocationsFilters.
    #: This constant has a value of "MALFORMED"
    STATUS_MALFORMED = "MALFORMED"

    #: A constant which can be used with the status property of a ExportInferenceInvocationsFilters.
    #: This constant has a value of "FAILED"
    STATUS_FAILED = "FAILED"

    #: A constant which can be used with the status property of a ExportInferenceInvocationsFilters.
    #: This constant has a value of "UNKNOWN"
    STATUS_UNKNOWN = "UNKNOWN"

    def __init__(self, **kwargs):
        """
        Initializes a new ExportInferenceInvocationsFilters object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param status:
            The value to assign to the status property of this ExportInferenceInvocationsFilters.
            Allowed values for this property are: "SUCCESS", "MALFORMED", "FAILED", "UNKNOWN"
        :type status: str

        :param model_version:
            The value to assign to the model_version property of this ExportInferenceInvocationsFilters.
        :type model_version: str

        :param request_uri:
            The value to assign to the request_uri property of this ExportInferenceInvocationsFilters.
        :type request_uri: str

        """
        self.swagger_types = {
            'status': 'str',
            'model_version': 'str',
            'request_uri': 'str'
        }
        self.attribute_map = {
            'status': 'status',
            'model_version': 'model_version',
            'request_uri': 'request_uri'
        }
        self._status = None
        self._model_version = None
        self._request_uri = None

    @property
    def status(self):
        """
        Gets the status of this ExportInferenceInvocationsFilters.
        Only export invocations with this outcome. Accepts every status the export emits, including MALFORMED (a 4xx response) and UNKNOWN (no status code on the response event).

        Allowed values for this property are: "SUCCESS", "MALFORMED", "FAILED", "UNKNOWN"


        :return: The status of this ExportInferenceInvocationsFilters.
        :rtype: str
        """
        return self._status

    @status.setter
    def status(self, status):
        """
        Sets the status of this ExportInferenceInvocationsFilters.
        Only export invocations with this outcome. Accepts every status the export emits, including MALFORMED (a 4xx response) and UNKNOWN (no status code on the response event).


        :param status: The status of this ExportInferenceInvocationsFilters.
        :type: str
        """
        allowed_values = ["SUCCESS", "MALFORMED", "FAILED", "UNKNOWN"]
        if not value_allowed_none_or_none_sentinel(status, allowed_values):
            raise ValueError(
                f"Invalid value for `status`, must be None or one of {allowed_values}"
            )
        self._status = status

    @property
    def model_version(self):
        """
        Gets the model_version of this ExportInferenceInvocationsFilters.
        Only export invocations served by this model version. Accepted for forward compatibility; producer records do not carry a model version yet, so this filter currently matches no records.


        :return: The model_version of this ExportInferenceInvocationsFilters.
        :rtype: str
        """
        return self._model_version

    @model_version.setter
    def model_version(self, model_version):
        """
        Sets the model_version of this ExportInferenceInvocationsFilters.
        Only export invocations served by this model version. Accepted for forward compatibility; producer records do not carry a model version yet, so this filter currently matches no records.


        :param model_version: The model_version of this ExportInferenceInvocationsFilters.
        :type: str
        """
        self._model_version = model_version

    @property
    def request_uri(self):
        """
        Gets the request_uri of this ExportInferenceInvocationsFilters.
        Only export invocations whose request URI exactly matches this value.


        :return: The request_uri of this ExportInferenceInvocationsFilters.
        :rtype: str
        """
        return self._request_uri

    @request_uri.setter
    def request_uri(self, request_uri):
        """
        Sets the request_uri of this ExportInferenceInvocationsFilters.
        Only export invocations whose request URI exactly matches this value.


        :param request_uri: The request_uri of this ExportInferenceInvocationsFilters.
        :type: str
        """
        self._request_uri = request_uri

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
