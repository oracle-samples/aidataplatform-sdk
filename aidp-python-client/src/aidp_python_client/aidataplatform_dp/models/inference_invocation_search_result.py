# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class InferenceInvocationSearchResult(object):
    """
    Paginated correlated inference invocation rows. Each response contains at most 20 rows; pagination is backed by OCI Logging. At most 10,000 matching rows can be retrieved.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new InferenceInvocationSearchResult object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param time_start:
            The value to assign to the time_start property of this InferenceInvocationSearchResult.
        :type time_start: datetime

        :param time_end:
            The value to assign to the time_end property of this InferenceInvocationSearchResult.
        :type time_end: datetime

        :param items:
            The value to assign to the items property of this InferenceInvocationSearchResult.
        :type items: list[oci.aidataplatform_dp.models.InferenceInvocationSummary]

        :param next_page_token:
            The value to assign to the next_page_token property of this InferenceInvocationSearchResult.
        :type next_page_token: str

        :param statuses:
            The value to assign to the statuses property of this InferenceInvocationSearchResult.
        :type statuses: list[oci.aidataplatform_dp.models.InferenceInvocationStatus]

        :param request_uris:
            The value to assign to the request_uris property of this InferenceInvocationSearchResult.
        :type request_uris: list[str]

        :param model_versions:
            The value to assign to the model_versions property of this InferenceInvocationSearchResult.
        :type model_versions: list[str]

        """
        self.swagger_types = {
            'time_start': 'datetime',
            'time_end': 'datetime',
            'items': 'list[InferenceInvocationSummary]',
            'next_page_token': 'str',
            'statuses': 'list[InferenceInvocationStatus]',
            'request_uris': 'list[str]',
            'model_versions': 'list[str]'
        }
        self.attribute_map = {
            'time_start': 'timeStart',
            'time_end': 'timeEnd',
            'items': 'items',
            'next_page_token': 'nextPageToken',
            'statuses': 'statuses',
            'request_uris': 'requestUris',
            'model_versions': 'modelVersions'
        }
        self._time_start = None
        self._time_end = None
        self._items = None
        self._next_page_token = None
        self._statuses = None
        self._request_uris = None
        self._model_versions = None

    @property
    def time_start(self):
        """
        **[Required]** Gets the time_start of this InferenceInvocationSearchResult.
        Inclusive start time resolved for this search query.


        :return: The time_start of this InferenceInvocationSearchResult.
        :rtype: datetime
        """
        return self._time_start

    @time_start.setter
    def time_start(self, time_start):
        """
        Sets the time_start of this InferenceInvocationSearchResult.
        Inclusive start time resolved for this search query.


        :param time_start: The time_start of this InferenceInvocationSearchResult.
        :type: datetime
        """
        self._time_start = time_start

    @property
    def time_end(self):
        """
        **[Required]** Gets the time_end of this InferenceInvocationSearchResult.
        Inclusive end time resolved for this search query.


        :return: The time_end of this InferenceInvocationSearchResult.
        :rtype: datetime
        """
        return self._time_end

    @time_end.setter
    def time_end(self, time_end):
        """
        Sets the time_end of this InferenceInvocationSearchResult.
        Inclusive end time resolved for this search query.


        :param time_end: The time_end of this InferenceInvocationSearchResult.
        :type: datetime
        """
        self._time_end = time_end

    @property
    def items(self):
        """
        **[Required]** Gets the items of this InferenceInvocationSearchResult.
        Correlated inference invocation rows for the requested page.


        :return: The items of this InferenceInvocationSearchResult.
        :rtype: list[oci.aidataplatform_dp.models.InferenceInvocationSummary]
        """
        return self._items

    @items.setter
    def items(self, items):
        """
        Sets the items of this InferenceInvocationSearchResult.
        Correlated inference invocation rows for the requested page.


        :param items: The items of this InferenceInvocationSearchResult.
        :type: list[oci.aidataplatform_dp.models.InferenceInvocationSummary]
        """
        self._items = items

    @property
    def next_page_token(self):
        """
        Gets the next_page_token of this InferenceInvocationSearchResult.
        Opaque token for retrieving the next page. Omitted when no additional page is available.


        :return: The next_page_token of this InferenceInvocationSearchResult.
        :rtype: str
        """
        return self._next_page_token

    @next_page_token.setter
    def next_page_token(self, next_page_token):
        """
        Sets the next_page_token of this InferenceInvocationSearchResult.
        Opaque token for retrieving the next page. Omitted when no additional page is available.


        :param next_page_token: The next_page_token of this InferenceInvocationSearchResult.
        :type: str
        """
        self._next_page_token = next_page_token

    @property
    def statuses(self):
        """
        **[Required]** Gets the statuses of this InferenceInvocationSearchResult.
        Available filter values: the distinct invocation statuses found across the whole requested time range. This is not narrowed by the filters in the request, so it stays stable while a caller changes filters.


        :return: The statuses of this InferenceInvocationSearchResult.
        :rtype: list[oci.aidataplatform_dp.models.InferenceInvocationStatus]
        """
        return self._statuses

    @statuses.setter
    def statuses(self, statuses):
        """
        Sets the statuses of this InferenceInvocationSearchResult.
        Available filter values: the distinct invocation statuses found across the whole requested time range. This is not narrowed by the filters in the request, so it stays stable while a caller changes filters.


        :param statuses: The statuses of this InferenceInvocationSearchResult.
        :type: list[oci.aidataplatform_dp.models.InferenceInvocationStatus]
        """
        self._statuses = statuses

    @property
    def request_uris(self):
        """
        **[Required]** Gets the request_uris of this InferenceInvocationSearchResult.
        Available filter values: the distinct inference endpoint URIs found across the whole requested time range. This is not narrowed by the filters in the request, so it stays stable while a caller changes filters.


        :return: The request_uris of this InferenceInvocationSearchResult.
        :rtype: list[str]
        """
        return self._request_uris

    @request_uris.setter
    def request_uris(self, request_uris):
        """
        Sets the request_uris of this InferenceInvocationSearchResult.
        Available filter values: the distinct inference endpoint URIs found across the whole requested time range. This is not narrowed by the filters in the request, so it stays stable while a caller changes filters.


        :param request_uris: The request_uris of this InferenceInvocationSearchResult.
        :type: list[str]
        """
        self._request_uris = request_uris

    @property
    def model_versions(self):
        """
        **[Required]** Gets the model_versions of this InferenceInvocationSearchResult.
        Model versions configured on the requested deployment.


        :return: The model_versions of this InferenceInvocationSearchResult.
        :rtype: list[str]
        """
        return self._model_versions

    @model_versions.setter
    def model_versions(self, model_versions):
        """
        Sets the model_versions of this InferenceInvocationSearchResult.
        Model versions configured on the requested deployment.


        :param model_versions: The model_versions of this InferenceInvocationSearchResult.
        :type: list[str]
        """
        self._model_versions = model_versions

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
